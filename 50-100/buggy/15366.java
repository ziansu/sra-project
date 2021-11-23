@java.lang.Override
public void write(dev.wolveringer.packet.PacketDataSerializer s) {
    if ((channel) != null)
        s.writeString(channel);
    
    try {
        data.readerIndex(0);
        int length = data.readableBytes();
        s.ensureWritable(length, true);
        java.lang.System.out.println(((("in - Buffer: " + (data)) + " - ") + length));
        s.writeBytes(data, length);
        data.release();
    } catch (java.lang.Exception e) {
        throw e;
    }
}