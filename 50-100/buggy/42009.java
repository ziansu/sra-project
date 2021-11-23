@java.lang.Override
public org.bukkit.inventory.ItemStack processItem(org.bukkit.Material material, int qty) {
    if (org.bukkit.material.Tree.class.isInstance(material.getData()))
        return new org.bukkit.inventory.ItemStack(material, qty);
    
    org.bukkit.material.Tree tree = new org.bukkit.material.Tree(material);
    tree.setSpecies(species);
    return tree.toItemStack(qty);
}