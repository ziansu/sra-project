public static org.bukkit.inventory.ItemStack addGlow(ml.lasertag.minigame.api.ItemStack item) {
    ml.lasertag.minigame.api.ItemStack nmsItem = org.bukkit.craftbukkit.v1_8_R2.inventory.CraftItemStack.asNMSCopy(item);
    ml.lasertag.minigame.api.NBTTagCompound tag = (nmsItem.hasTag()) ? nmsItem.getTag() : new ml.lasertag.minigame.api.NBTTagCompound();
    ml.lasertag.minigame.api.NBTTagList ench = new ml.lasertag.minigame.api.NBTTagList();
    tag.set("ench", ench);
    nmsItem.setTag(tag);
    return org.bukkit.craftbukkit.v1_8_R2.inventory.CraftItemStack.asCraftMirror(nmsItem);
}