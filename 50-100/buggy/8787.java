public void init(java.lang.String serverAddress, int serverPort, int hostPort, java.util.concurrent.BlockingQueue<java.lang.String> msgQueue) throws java.io.IOException {
    java.net.Socket s = new java.net.Socket();
    s.bind(new java.net.InetSocketAddress(hostPort));
    s.connect(new java.net.InetSocketAddress(serverAddress, serverPort));
    this.out = new java.io.OutputStreamWriter(s.getOutputStream());
    java.lang.Runnable fetcher = new com.nutscape.mc.nunuubot.Connection.MessageFetcher(s.getInputStream(), msgQueue, bot);
    new java.lang.Thread(fetcher).start();
}