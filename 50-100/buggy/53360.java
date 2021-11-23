public boolean isWithinBounds() {
    if (((((X) < 2) || ((X) > (Table.COLUMN))) || ((Y) < 2)) || ((Y) > (Table.ROW))) {
        return false;
    }
    return true;
}