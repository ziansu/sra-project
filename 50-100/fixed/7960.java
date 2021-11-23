public static void main(java.lang.String[] args) {
    java.lang.String s;
    if ((args.length) > 0) {
        s = args[0];
    }else {
        s = "etc/server.properties";
    }
    org.alicebot.server.net.AliceServer aliceserver = new org.alicebot.server.net.AliceServer(s);
    java.lang.Runtime.getRuntime().addShutdownHook(new java.lang.Thread("Shutdown Thread") {
        public void run() {
            org.alicebot.server.net.AliceServer.shutdown();
        }
    });
    aliceserver.startup(true);
}