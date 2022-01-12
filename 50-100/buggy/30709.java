@java.lang.Override
public net.minecraft.nbt.NBTTagCompound getUpdateTag() {
    net.minecraft.nbt.NBTTagCompound compound = super.getUpdateTag();
    net.minecraft.util.math.BlockPos thisPos = this.pos;
    io.netty.util.internal.ConcurrentSet<de.ellpeck.actuallyadditions.mod.misc.LaserRelayConnectionHandler.ConnectionPair> connections = de.ellpeck.actuallyadditions.mod.misc.LaserRelayConnectionHandler.getInstance().getConnectionsFor(thisPos);
    if (connections != null) {
        net.minecraft.nbt.NBTTagList list = new net.minecraft.nbt.NBTTagList();
        for (de.ellpeck.actuallyadditions.mod.misc.LaserRelayConnectionHandler.ConnectionPair pair : connections) {
            list.appendTag(pair.writeToNBT());
        }
        compound.setTag("Connections", list);
    }
    return compound;
}