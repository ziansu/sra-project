public void start() {
    try {
        quickfix.SessionSettings settings = new quickfix.SessionSettings("src/Server.cfg");
        com.thanatos.FixServer server = new com.thanatos.FixServer();
        quickfix.FileStoreFactory storeFactory = new quickfix.FileStoreFactory(settings);
        quickfix.ScreenLogFactory logFactory = new quickfix.ScreenLogFactory(settings);
        quickfix.Acceptor acceptor = new quickfix.SocketAcceptor(server, storeFactory, settings, logFactory, new quickfix.DefaultMessageFactory());
        acceptor.start();
        setupJobs();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}