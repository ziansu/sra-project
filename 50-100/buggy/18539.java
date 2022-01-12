public boolean contains(Utilities.ItemUtilities.ItemsEnum itemsEnum) {
    if (itemsEnum == null) {
        return true;
    }
    for (int i = 0; i < (cap); i++) {
        if ((items[i]) != null) {
        }
        if ((items[i].getItemType()) == itemsEnum) {
            return true;
        }
    }
    return false;
}