public void putContentPacket(int offset, engine.network.packet.Packet packet) {
    if (!(checkAvailable(offset, packet.getSize())))
        return ;
    
    for (int i = 0; i < (packet.getSize()); i++) {
        content.put((offset + i), packet.getByte(i));
        occupy((offset + i), engine.network.packet.Packet.BYTE_SIZE);
    }
}