@java.lang.Override
public void visitInventory(com.wecanteven.Models.Storage.ItemStorage.Inventory inventory) {
    com.wecanteven.SaveLoad.XMLProcessors.StorageXMLProcessor.formatInvetory(inventory);
    java.util.Iterator itemIter = inventory.getOrderedIterator();
    com.wecanteven.UtilityClasses.Tuple<com.wecanteven.Models.Items.Takeable.TakeableItem, java.lang.Integer> itemSlot;
    while (itemIter.hasNext()) {
        itemSlot = ((com.wecanteven.UtilityClasses.Tuple) (itemIter.next()));
        java.lang.System.out.println(itemSlot.x.getName());
        com.wecanteven.SaveLoad.XMLProcessors.StorageXMLProcessor.formatItemSlot(itemSlot.y);
        itemSlot.x.accept(this);
    } 
}