public void setHasMax(boolean val) {
    hasMax = val;
    if (hasMax) {
        for (javafx.collections.ObservableList<java.lang.Long> table : scores.values()) {
            if ((table.size()) > (maxSize)) {
                table.subList(((maxSize) - 1), table.size()).clear();
            }
        }
    }
}