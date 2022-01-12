public void addItem(item.Item i, int count) {
    item.Item item = i.clone();
    if (count != (-1)) {
        item.count = count;
    }
    if (i.isStackable) {
        int loc = findShopItemLoc(i);
        if (loc >= 0) {
            items.get(loc).count += item.count;
        }else {
            items.add(item);
        }
    }else {
        items.add(item);
    }
}