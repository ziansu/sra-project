private void save() {
    if ((_dataNode) == null)
        return ;
    
    java.util.Collection<com.jcwhatever.nucleus.utils.items.MatchableItem> wrappers = _filterItems.values();
    java.util.List<org.bukkit.inventory.ItemStack> stacks = new java.util.ArrayList<org.bukkit.inventory.ItemStack>(wrappers.size());
    for (com.jcwhatever.nucleus.utils.items.MatchableItem wrapper : wrappers) {
        stacks.add(wrapper.getItem());
    }
    _dataNode.set("items", stacks.toArray(new org.bukkit.inventory.ItemStack[stacks.size()]));
    _dataNode.save();
}