private void updateItemSuggestions() {
    standard.engine.Room current = player.getLocation();
    item_suggestions.clear();
    java.util.ArrayList<java.lang.String> itemsPresent = current.listAllItems(this);
    for (java.lang.String itemId : itemsPresent) {
        item_suggestions.add(itemId);
    }
    java.util.Set<java.lang.String> itemsInv = player.inventory.keySet();
    for (java.lang.String itemId : itemsInv) {
        item_suggestions.add(itemId);
    }
}