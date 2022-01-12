private boolean invalidIndexForInsert(final int itemIndex) {
    if (itemIndex < 0) {
        return true;
    }
    return itemIndex > (items.size());
}