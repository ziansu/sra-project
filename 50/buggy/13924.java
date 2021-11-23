@java.lang.Override
public void write(io.netty.buffer.ByteBuf buffer) {
    buffer.writeBoolean(((playerHook) != null));
    playerHook.write(buffer);
}