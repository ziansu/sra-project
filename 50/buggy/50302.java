public java.lang.String viewInventory() {
    java.lang.String inventoryItems = "";
    if (inventoryItems.isEmpty())
        return "Your inventory is empty";
    
    for (java.lang.String key : this.inventory.keySet())
        inventoryItems += key + " ";
    
    return "You have in your inventory: " + inventoryItems;
}