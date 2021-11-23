public void addItem(java.lang.String id, int count) {
    item.Item i = item.Item.item(id);
    i.count = count;
    addItem(i);
}