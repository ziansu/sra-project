@java.lang.Override
public void writeSpawnData(io.netty.buffer.ByteBuf data) {
    java.lang.System.out.println("1.8 VERIFY THIS WORKS");
    net.minecraftforge.fml.common.network.ByteBufUtils.writeUTF8String(data, Block.blockRegistry.getNameForObject(tile).toString());
    data.writeInt(metadata);
}