@java.lang.Override
public void completed(java.lang.Void result, java.nio.channels.AsynchronousSocketChannel channel) {
    startWrite(channel, packet);
}