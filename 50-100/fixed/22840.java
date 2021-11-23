private void updateItemSuggestions() {
    standard.engine.Room current = player.getLocation();
    item_suggestions.clear();
    java.util.ArrayList<java.lang.String> itemsPresent = current.listAllItems(this);
    for (java.lang.String itemId : itemsPresent) {
        item_suggestions.add(itemId);
    }
    java.util.ArrayList<java.lang.String> itemsInv = player.listAllItems(this);
    for (java.lang.String itemId : itemsInv) {
        item_suggestions.add(itemId);
    }
}