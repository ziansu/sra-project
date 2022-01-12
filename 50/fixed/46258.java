public boolean isItem(int slot, net.minecraft.item.Item item) {
    return (!(inventoryContents[slot].isEmpty())) && ((inventoryContents[slot].getItem()) == item);
}