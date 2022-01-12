public void commandTransferTo(com.esbjon.inventories.Inventory receiver, com.esbjon.entities.Collectible.collectibleType type, int maxTransfer) {
    int n = 0;
    while (((receiver.belowInventoryCapacity()) && ((level.countItems(type)) > 0)) && (n < maxTransfer)) {
        receiver.level.addItem(type);
        receiver.addToCount(type);
        this.level.removeItem(type, true, 0);
        this.substractFromCount(type);
        maxTransfer++;
    } 
}