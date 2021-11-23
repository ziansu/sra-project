@java.lang.Override
public net.minecraft.network.Packet getDescriptionPacket() {
    net.minecraftforge.fluids.FluidStack fluidStack = getFluid();
    net.minecraft.nbt.NBTTagCompound tag = new net.minecraft.nbt.NBTTagCompound();
    if (fluidStack != null) {
        fluidStack.writeToNBT(tag);
    }
    return new net.minecraft.network.play.server.S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, (-1), tag);
}