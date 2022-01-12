public static int freePort() {
    java.util.Random random = new java.util.Random();
    int port;
    do {
        port = random.nextInt(65535);
    } while (!(org.opencron.common.utils.HttpUtils.isLocalPortUsing(port)) );
    return port;
}