public static void main(java.lang.String[] args) {
    int port = 30000;
    if ((args.length) < 1) {
        port = java.lang.Integer.parseInt(args[0]);
    }
    server.Server si = new server.Server(port);
    si.startServer();
}