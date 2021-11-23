public org.bukkit.inventory.ItemStack[] getRewards() {
    org.bukkit.inventory.ItemStack[] rewards = new org.bukkit.inventory.ItemStack[8];
    for (java.lang.String path : configRewards.getKeys(false)) {
        int i = java.lang.Integer.parseInt(path.substring(7));
        org.bukkit.inventory.ItemStack item = configRewards.getItemStack(("reward_" + i));
        rewards[i] = item;
    }
    return rewards;
}