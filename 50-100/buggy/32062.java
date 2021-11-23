@java.lang.Override
public void receivedBuffer(final short p_sourceNodeId, java.nio.ByteBuffer p_buffer, final int p_length) {
    de.hhu.bsinfo.net.ib.IBConnectionManager.LOGGER.trace("Received buffer (%d) from 0x%X", p_length, p_sourceNodeId);
    de.hhu.bsinfo.net.ib.IBConnection connection;
    try {
        connection = ((de.hhu.bsinfo.net.ib.IBConnection) (getConnection(p_sourceNodeId)));
    } catch (final de.hhu.bsinfo.net.core.NetworkException e) {
        de.hhu.bsinfo.net.ib.IBConnectionManager.LOGGER.error("Getting connection for recv buffer of node 0x%X failed", p_sourceNodeId, e);
        return ;
    }
    p_buffer.limit(p_length);
    p_buffer.rewind();
    connection.getPipeIn().processReceivedBuffer(p_buffer, p_length);
}