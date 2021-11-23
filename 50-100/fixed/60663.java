@java.lang.Override
public void readData(io.netty.buffer.ByteBuf stream) {
    int flags = stream.readUnsignedByte();
    energyStage = buildcraft.api.enums.EnumEnergyStage.values()[(flags & 7)];
    isPumping = (flags & 8) != 0;
    orientation = net.minecraft.util.EnumFacing.values()[stream.readByte()];
}