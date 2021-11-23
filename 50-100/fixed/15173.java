public void addItem(com.mygdx.scene.item.InventoryItem item, int quantity) {
    if ((this.item) == null) {
        this.item = item;
        this.quantity = quantity;
    }else
        if (this.item.equals(item)) {
            this.quantity += quantity;
        }
    
    replaceItem();
}