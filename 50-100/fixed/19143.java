public static void main(java.lang.String[] args, servers.Server customServer) throws java.io.IOException {
    java.lang.System.out.println(args.length);
    servers.Server server = Main.setServer(customServer);
    Main.setServerSocketPort(server, args);
    Main.setDirectory(server, args);
    server.startServer();
}