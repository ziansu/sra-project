public void reset() {
    int size = _transforms.size();
    _transforms.clear();
    fireTableRowsDeleted(0, (size - 1));
}