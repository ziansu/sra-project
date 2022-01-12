public static void beginServer(int port, main.Window.state s) throws java.io.IOException {
    switch (s) {
        case ENABLED :
            main.Window.stopServer = false;
            main.Window.serverPort = port;
            java.lang.System.out.println("this is working");
            main.Window.ServerThread server = new main.Window.ServerThread();
            server.start();
            break;
        case DISABLED :
            main.Window.stopServer = true;
            break;
        default :
            break;
    }
}