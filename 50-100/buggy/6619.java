@java.lang.Override
public void write(io.netty.buffer.ByteBuf byteBuf) throws java.lang.Exception {
    byteBuf.writeInt(getPlayername().length());
    byteBuf.writeCharSequence(getPlayername(), com.google.common.base.Charsets.UTF_8);
    byteBuf.writeInt(getHost().length());
    byteBuf.writeCharSequence(getHost(), com.google.common.base.Charsets.UTF_8);
    byteBuf.writeInt(getPort());
    byteBuf.writeBoolean(isSuccess());
}