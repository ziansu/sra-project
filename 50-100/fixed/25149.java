public boolean equipItem(int i) {
    if ((i < (items.size())) && (items.get(i).getItem().isEquippable())) {
        equippedItemStack = items.get(i);
        return true;
    }
    return false;
}