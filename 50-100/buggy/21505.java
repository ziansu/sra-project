public org.bukkit.inventory.ItemStack[] randomize(int numOfItems) throws java.lang.IllegalArgumentException {
    if (numOfItems <= 0)
        throw new java.lang.IllegalArgumentException("number of items can not be less than 1");
    
    org.bukkit.inventory.ItemStack[] items = new org.bukkit.inventory.ItemStack[numOfItems];
    for (int i = 0; i < numOfItems; i++) {
        double percent = (java.lang.Math.random()) * (manager.getTotal());
        me.dotsaviour.randomizerapi.Item item = manager.getInBoundaries(percent);
        items[i] = item.getItemStack();
    }
    return items;
}