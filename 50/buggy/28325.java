public void dropCurrent() {
    Characters.Inventory.Inventory.Items[Characters.Inventory.Inventory.currentCategory].Remove(Characters.Inventory.Inventory.inventoryBox.itemArray[Characters.Inventory.Inventory.inventoryBox.currentItem].getKey());
}