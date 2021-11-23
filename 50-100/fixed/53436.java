@java.lang.Override
public void onAssign(org.bukkit.inventory.ItemStack item, boolean unused) {
    if ((item.getType().getMaxDurability()) > 0) {
        if ((durabilityPercent) > 0)
            durability = ((short) ((item.getType().getMaxDurability()) * (((double) (durabilityPercent)) / 100.0)));
        
        item.setDurability(durability);
    }
}