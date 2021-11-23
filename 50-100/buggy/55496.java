@java.lang.Override
public void read(io.netty.buffer.ByteBuf byteBuf) throws java.lang.Exception {
    int length;
    length = byteBuf.readInt();
    setPlayername(((java.lang.String) (byteBuf.readCharSequence(length, com.google.common.base.Charsets.UTF_8))));
    length = byteBuf.readInt();
    setHost(((java.lang.String) (byteBuf.readCharSequence(length, com.google.common.base.Charsets.UTF_8))));
    setPort(byteBuf.readInt());
    setSuccess(byteBuf.readBoolean());
}