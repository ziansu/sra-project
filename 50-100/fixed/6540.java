public static void addItemToInventory(byui.cit260.fireSwamp.model.Item item, java.util.ArrayList<byui.cit260.fireSwamp.model.Item> inventory) throws byui.cit260.fireSwamp.exceptions.InventoryControlException {
    byui.cit260.fireSwamp.model.Item newItem = new byui.cit260.fireSwamp.model.Item();
    newItem.setItemDescription(item.getItemDescription());
    newItem.setItemName(item.getItemName());
    newItem.setItemType(item.getItemType());
    boolean add = inventory.add(newItem);
    if (add == false) {
        throw new byui.cit260.fireSwamp.exceptions.InventoryControlException("Unable to add item to inventory.");
    }
}