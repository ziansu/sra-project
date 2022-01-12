public boolean removeItem(java.lang.String itemName) {
    for (dnd.Item item : items) {
        if (item.getName().equalsIgnoreCase(itemName)) {
            items.remove(item);
            return true;
        }
    }
    return false;
}