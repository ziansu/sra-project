public static void destroy() {
    client.NettyClient.charServClient.destroy();
    if ((client.NettyClient.gameServClient) != null) {
        client.NettyClient.gameServClient.destroy();
    }
}