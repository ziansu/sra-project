public static int getMaxStack(org.bukkit.inventory.ItemStack it) {
    me.jascotty2.libv01.bukkit.item.JItems i = (it == null) ? null : me.jascotty2.libv01.bukkit.item.JItems.getItem(it.getTypeId(), ((it.getData()) == null ? 0 : it.getData().getData()));
    return i == null ? 64 : i.MaxStackSize();
}