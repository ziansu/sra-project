@java.lang.Override
public void write(io.netty.buffer.ByteBuf buf) throws java.lang.Exception {
    buf.writeInt(seed);
    buf.writeByte(dimension);
    buf.writeInt(generator);
    buf.writeInt(gamemode);
    buf.writeLong(entityId);
    buf.writeInt(spawnX);
    buf.writeInt(spawnY);
    buf.writeInt(spawnZ);
    buf.writeFloat(x);
    buf.writeFloat(y);
    buf.writeFloat(z);
    buf.writeByte(unknown);
}