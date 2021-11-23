public static void setCooldownTime(net.minecraft.entity.player.EntityPlayer player, int skill, int cd) {
    net.minecraft.item.ItemStack item = player.getCurrentArmor(1);
    if ((item == null) || (!(item.hasTagCompound())))
        return ;
    
    item.setTagInfo(("cd" + skill), new net.minecraft.nbt.NBTTagInt(cd));
}