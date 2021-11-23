@java.lang.Override
public org.bukkit.inventory.ItemStack getItem(int index) {
    return com.bergerkiller.bukkit.common.utils.ItemUtil.cloneItem(this.items[index]);
}