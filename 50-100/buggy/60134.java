public static de.robotricker.transportpipes.pipeitems.ItemData fromNBTTag(org.jnbt.CompoundTag tag) {
    java.util.Map<java.lang.String, org.jnbt.Tag> map = tag.getValue();
    org.bukkit.inventory.ItemStack item = null;
    try {
        java.lang.String rawItem = ((org.jnbt.StringTag) (map.get("Item"))).getValue();
        item = de.robotricker.transportpipes.pipeitems.ItemData.stringBlobToItem(rawItem);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.out.println("Unable to load pipe! (Maybe outdated NBT format?)");
    }
    return new de.robotricker.transportpipes.pipeitems.ItemData(item);
}