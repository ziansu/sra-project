public void setGraveItems(java.util.List<net.minecraft.entity.item.EntityItem> itemsList) {
    int i = 0;
    for (net.minecraft.entity.item.EntityItem item : itemsList) {
        internalInventory.setInventorySlotContents(i, item.getEntityItem());
        i++;
    }
}