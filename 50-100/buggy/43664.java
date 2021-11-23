public static void main(java.lang.String[] args) {
    int port;
    int coreCount = 6;
    switch (args.length) {
        case 1 :
            port = Main.getUserPort();
            break;
        case 0 :
            port = Main.getUserPort();
            break;
        default :
            port = java.lang.Integer.parseInt(args[0]);
            coreCount = java.lang.Integer.parseInt(args[1]);
            break;
    }
    new Main(port, coreCount);
}