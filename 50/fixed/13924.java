@java.lang.Override
public void write(io.netty.buffer.ByteBuf buffer) {
    buffer.writeBoolean(((playerHook) != null));
    if ((playerHook) != null) {
        playerHook.write(buffer);
    }
}