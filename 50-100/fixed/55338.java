public int removeFromInventory(java.lang.String toRemove) {
    if (this.inventory.isEmpty()) {
        return 0;
    }
    int removed = 0;
    java.util.Iterator<com.example.Furniture> iter = this.inventory.iterator();
    while (iter.hasNext()) {
        com.example.Furniture currentFurn = iter.next();
        if ((currentFurn != null) && (currentFurn.getName().equals(toRemove))) {
            iter.remove();
            ++removed;
        }
    } 
    return removed;
}