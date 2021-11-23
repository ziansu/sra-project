@java.lang.Override
public void write(dev.wolveringer.packet.PacketDataSerializer s) {
    if ((channel) != null)
        s.writeString(channel);
    
    try {
        data.readerIndex(0);
        int length = data.readableBytes();
        s.ensureWritable(length, true);
        s.writeBytes(data, length);
        data.release();
    } catch (java.lang.Exception e) {
        throw e;
    }
}