public static boolean equals(org.bukkit.inventory.ItemStack one, org.bukkit.inventory.ItemStack two) {
    return (one.isSimilar(two)) && (one.toString().equals(two.toString()));
}