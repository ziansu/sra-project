private static net.minecraft.nbt.NBTTagCompound saveStackDataToPacket(net.minecraft.item.ItemStack stack, net.minecraft.nbt.NBTTagCompound packet) {
    if (packet == null)
        packet = new net.minecraft.nbt.NBTTagCompound();
    
    net.minecraft.nbt.NBTTagCompound itemStackData = stack.getTagCompound();
    packet.setShort("humidityLevel", itemStackData.getShort("humidityLevel"));
    packet.setShort("combustionDuration", itemStackData.getShort("combustionDuration"));
    return packet;
}