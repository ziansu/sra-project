public void addItem(item.Item i) {
    item.Item item = i.clone();
    if (i.isStackable) {
        int loc = findShopItemLoc(i);
        if (loc >= 0) {
            items.get(loc).count += i.count;
        }else {
            items.add(item);
        }
    }else {
        items.add(item);
    }
}