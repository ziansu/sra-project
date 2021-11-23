public boolean equipItem(int i) {
    if (((i < (items.size())) && (i > 0)) && (items.get(i).getItem().isEquippable())) {
        equippedItemStack = items.get(i);
        return true;
    }
    return false;
}