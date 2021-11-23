public static void destroy() {
    client.NettyClient.charServClient.destroy();
    client.NettyClient.gameServClient.destroy();
}