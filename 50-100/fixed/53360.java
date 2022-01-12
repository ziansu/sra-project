public boolean isWithinBounds() {
    if (((((X) < 1) || ((X) >= (Table.COLUMN))) || ((Y) < 1)) || ((Y) >= (Table.ROW))) {
        return false;
    }
    return true;
}