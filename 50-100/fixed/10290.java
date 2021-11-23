private int getStartSelectItem() {
    int currentItem = (java.lang.Integer.MAX_VALUE) / 2;
    if ((currentItem % (getRealCount())) == 0) {
        return currentItem;
    }
    while ((currentItem % (getRealCount())) != 0) {
        currentItem++;
    } 
    return currentItem;
}