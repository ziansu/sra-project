public player.item.Item find(java.lang.String itemStr) {
    itemStr = itemStr.toLowerCase();
    for (player.item.Item item : items) {
        if (item.name.toLowerCase().equals(itemStr))
            return item;
        
    }
    return null;
}