public static void main(java.lang.String[] args) {
    java.net.InetSocketAddress serverAddr = new java.net.InetSocketAddress("localhost", 8080);
    java.net.InetSocketAddress pop3 = new java.net.InetSocketAddress("pop.gmx.com", 110);
    java.util.concurrent.BlockingQueue<java.nio.channels.SelectionKey> outbox = new java.util.concurrent.LinkedBlockingQueue<>();
    ar.edu.itba.protos.grupo6.Server server = new ar.edu.itba.protos.grupo6.Server(serverAddr, pop3, outbox);
    ar.edu.itba.protos.grupo6.HandlerPool pool = new ar.edu.itba.protos.grupo6.HandlerPool(outbox, server);
    new java.lang.Thread(server).run();
}