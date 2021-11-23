public void fill(int xOffset, int yOffset, int xLength, int yLength, org.bukkit.inventory.ItemStack with) {
    for (int x = xOffset; x < (xLength + xOffset); x++) {
        for (int y = xOffset; y < (yLength + yOffset); y++) {
            setItem(x, y, with);
        }
    }
}