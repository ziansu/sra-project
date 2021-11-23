@java.lang.Override
public void readSpawnData(io.netty.buffer.ByteBuf data) {
    tile = ((net.minecraft.block.Block) (Block.blockRegistry.getObject(new net.minecraft.util.ResourceLocation(net.minecraftforge.fml.common.network.ByteBufUtils.readUTF8String(data)))));
    metadata = data.readInt();
}