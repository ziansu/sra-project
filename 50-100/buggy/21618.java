public void addItem(Item item, int count) {
    if ((count < 1) || (item == null)) {
        return ;
    }
    if (allItems.containsKey(item)) {
        allItems.put(item, ((allItems.get(item)) + count));
    }else {
        allItems.put(item, count);
    }
}