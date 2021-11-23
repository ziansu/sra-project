private org.bukkit.inventory.ItemStack[] getItems(java.util.List<java.lang.String> items, int i) {
    java.util.List<org.bukkit.inventory.ItemStack> list = new java.util.ArrayList<>();
    for (java.util.Iterator<java.lang.String> iterator = items.iterator(); (iterator.hasNext()) && ((list.size()) < i);) {
        java.lang.String in = iterator.next();
        list.add(fromString(in));
    }
    return list.toArray(new org.bukkit.inventory.ItemStack[i]);
}