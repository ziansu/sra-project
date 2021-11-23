public static void initializeFrameReceiver() {
    client.Client.frameReceiver = new client.FrameReceiver(client.Client.socket, client.Client.in, client.Client.out, client.Client.frameQueue);
    client.Client.frameReceiver.run();
}