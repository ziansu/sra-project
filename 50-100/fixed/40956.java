public long getSelectedItemId() {
    long result = -1;
    int pos = getSelectedItemPosition();
    if (((pos >= 0) && (pos < (item.size()))) && (item.get(pos).isActive())) {
        return item.get(pos).getId();
    }
    return result;
}