public void setInventory(int inventory) {
    if (inventory < 0)
        inventory = 0;
    
    this.inventory = inventory;
}