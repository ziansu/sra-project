public void removeFromInventory(Item rem) {
    int removed = -1;
    for (int i = 0; i < (inventory.size()); i++) {
        if (inventory.get(i).equals(rem))
            removed = i;
        
    }
    if (removed != (-1)) {
        inventory.remove(removed);
    }
}