public resources.Item takeItem(java.lang.String itemName) {
    if (items.containsKey(itemName)) {
        resources.Item i = items.get(itemName);
        if (!(i.canBeTaken()))
            return null;
        
        items.remove(itemName);
        return i;
    }
    return null;
}