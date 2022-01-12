private boolean matches(java.util.Collection<org.bukkit.inventory.ItemStack> avail, int index) {
    io.github.phantamanta44.mcrail.crafting.List<org.bukkit.inventory.ItemStack> matches = avail.stream().filter(ingredients.get(index)).collect(java.util.stream.Collectors.toList());
    for (org.bukkit.inventory.ItemStack match : matches) {
        avail.remove(match);
        boolean restWorks = matches(avail, (index + 1));
        avail.add(match);
        if (restWorks)
            return true;
        
    }
    return false;
}