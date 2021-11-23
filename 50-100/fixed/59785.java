@java.lang.Override
public void onDataPacket(net.minecraft.network.NetworkManager net, net.minecraft.network.play.server.S35PacketUpdateTileEntity packet) {
    for (int i = 0; i < (getSizeInventory()); i++) {
        net.minecraft.nbt.NBTTagCompound itemStackCompound = packet.func_148857_g().getCompoundTag(("slotItem" + i));
        if ((itemStackCompound.getShort("id")) != 0)
            inventory[i] = net.minecraft.item.ItemStack.loadItemStackFromNBT(itemStackCompound);
        else
            inventory[i] = null;
        
    }
}