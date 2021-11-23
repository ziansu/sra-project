@java.lang.Override
public net.minecraft.nbt.NBTTagCompound getUpdateTag() {
    net.minecraft.nbt.NBTTagCompound compound = super.getUpdateTag();
    net.minecraft.nbt.NBTTagList list = new net.minecraft.nbt.NBTTagList();
    io.netty.util.internal.ConcurrentSet<de.ellpeck.actuallyadditions.mod.misc.LaserRelayConnectionHandler.ConnectionPair> connections = de.ellpeck.actuallyadditions.mod.misc.LaserRelayConnectionHandler.getInstance().getConnectionsFor(this.pos);
    if ((connections != null) && (!(connections.isEmpty()))) {
        for (de.ellpeck.actuallyadditions.mod.misc.LaserRelayConnectionHandler.ConnectionPair pair : connections) {
            list.appendTag(pair.writeToNBT());
        }
    }
    compound.setTag("Connections", list);
    return compound;
}