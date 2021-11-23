public boolean resourceEmpty() {
    boolean bool = true;
    for (int k = 0; k < (Resources.size()); k++) {
        if ((Resources.get(k).getInventory()) > 0) {
            return false;
        }
    }
    return bool;
}