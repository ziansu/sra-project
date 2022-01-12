@java.lang.Override
public void readDescPacket(io.netty.buffer.ByteBuf buf) {
    super.writeDescPacket(buf);
    processTime = buf.readInt();
}