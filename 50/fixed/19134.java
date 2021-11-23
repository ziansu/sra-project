public void removeItem(no.opentech.shoppinglist.entities.Item item) {
    getShoppingListItems().remove(item);
    no.opentech.shoppinglist.utils.Utils.getShoppingListRepository().removeItemFromShoppingList(item, shoppingList);
}