public void remove(com.dd.dataTypes.bodyAreas.Item item) throws com.dd.dataTypes.bodyAreas.InventoryException {
    if (items.containsValue(item)) {
        this.items.remove(item);
    }else {
        throw new com.dd.dataTypes.bodyAreas.InventoryException(((item.titleToString()) + " is not in your inventory. "));
    }
}