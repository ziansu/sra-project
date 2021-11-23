public boolean craft(adventure.Item item, adventure.Inventory inv) {
    if (!(canCraft(item, inv)))
        return false;
    
    adventure.Recipe r = getRecipe(item);
    for (int i = 0; i < (r.input.length); i++) {
        inv.remove(r.input[i].name, 1);
    }
    inv.add(r.output, 1);
    return true;
}