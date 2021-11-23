private boolean invalidIndexForInsert(final int itemIndex) {
    if (itemIndex < 0) {
        return true;
    }
    if (itemIndex > (items.size())) {
        return true;
    }
    return false;
}