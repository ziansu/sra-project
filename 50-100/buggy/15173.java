public void addItem(com.mygdx.scene.item.InventoryItem item) {
    if ((this.item) == null) {
        this.item = item;
        this.quantity = 1;
    }else
        if (this.item.equals(item)) {
            (this.quantity)++;
        }
    
    replaceItem();
}