@java.lang.Override
public void completed(java.lang.Void result, java.nio.channels.AsynchronousSocketChannel channel) {
    startRead(channel);
    startWrite(channel, packet);
}