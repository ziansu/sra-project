public void reset() {
    int size = _transforms.size();
    if (size > 0) {
        _transforms.clear();
        fireTableRowsDeleted(0, (size - 1));
    }
}