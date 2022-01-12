public void run() {
    while (true) {
        try {
            java.net.Socket cs = ServerChat.accept();
            chat.Server.FirUtilizator t = new chat.Server.FirUtilizator(cs);
            t.start();
            threads.add(t);
        } catch (java.io.IOException ex) {
            java.lang.System.out.println("Oops");
        }
    } 
}