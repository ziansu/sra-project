public void start(java.lang.String s) {
    org.alicebot.server.core.Globals.load(s);
    shell = new org.alicebot.server.core.util.Shell(inStream, displayStream, promptStream);
    server = new org.alicebot.server.net.AliceServer(s, shell);
    org.alicebot.server.core.util.Trace.setOut(displayStream);
    server.startup(true);
    shutdown();
}