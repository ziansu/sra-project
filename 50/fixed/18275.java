private void destroyPacket(io.netty.buffer.ByteBuf packet) {
    if (packet != null) {
        packet.release();
    }
}