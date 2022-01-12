public void RemoveItem(java.lang.String item) {
    java.util.Iterator<Items.Item> iterator = inventory.iterator();
    while (iterator.hasNext()) {
        if (iterator.next().GetItemName().equalsIgnoreCase(item)) {
            iterator.remove();
            return ;
        }
    } 
}