@java.lang.Override
public void processData(fx.networking.nio.NIOServer server, java.nio.channels.SocketChannel socket, byte[] data, int count) {
    byte[] dataCopy = new byte[count];
    java.lang.System.arraycopy(data, 0, dataCopy, 0, count);
    queue.add(new fx.networking.nio.ServerDataEvent(server, socket, dataCopy));
}