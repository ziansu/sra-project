public boolean clear() {
    _filterItems.clear();
    if ((_dataNode) != null) {
        _dataNode.set("items", null);
        _dataNode.save();
    }
    return true;
}