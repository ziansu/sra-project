@java.lang.Override
public void writeToChannel(io.datakernel.bytebuf.ByteBuf buf) {
    io.datakernel.eventloop.DatakernelSslEngine.logger.trace("on write {} bytes of app data", buf.remaining());
    app2engine = toBuffer(buf, app2engine);
    try {
        doWrite();
    } catch (javax.net.ssl.SSLException e) {
        onWriteException(e);
    }
}