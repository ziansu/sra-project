public static model.InventoryItem updateInventoryItem(java.lang.String[] stringArray, model.InventoryItem updateItem) {
    updateItem.setErrorCount(0);
    updateItem.setPartId(java.lang.Integer.parseInt(stringArray[0]));
    updateItem.setQuantity(stringArray[1]);
    updateItem.setLocation(stringArray[2]);
    updateItem = model.InventoryItemDB.updateInventoryItem(updateItem);
    if ((updateItem.getErrorCount()) == 0)
        controller.MainController.inventoryLocationFrame.refresh();
    
    return updateItem;
}