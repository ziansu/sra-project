public static org.bukkit.inventory.ItemStack deserialize(byte[] src) {
    return ((org.bukkit.inventory.ItemStack) (com.pizzaguy.serialization.ItemStackSerialization.deserialize(src, 0).getResult()));
}