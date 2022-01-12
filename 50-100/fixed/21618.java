public void addItem(Item item, int count) throws java.lang.Exception {
    if ((count < 1) || (item == null)) {
        return ;
    }
    if (allItems.containsKey(item)) {
        allItems.put(item, ((allItems.get(item)) + count));
    }else {
        allItems.put(item, count);
    }
    if ((allItems.get(item)) < 0) {
        throw new java.lang.Exception();
    }
}