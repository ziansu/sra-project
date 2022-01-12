private java.util.List<T> firstComboAtSize() {
    java.util.List<T> retVal = new java.util.ArrayList<>();
    for (int i = (list.size()) - (comboSize); i < (list.size()); ++i) {
        retVal.add(list.get(i));
    }
    if ((retVal.isEmpty()) & ((comboSize) != 0)) {
        retVal = NO_MORE_COMBOS_AVAILABLE();
    }
    return retVal;
}