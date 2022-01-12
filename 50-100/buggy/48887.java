public java.util.List<java.lang.Integer> getSelectedItems() {
    java.util.List<java.lang.Integer> items = new java.util.ArrayList<java.lang.Integer>(selectedItems.size());
    for (int i = 0; i < (selectedItems.size()); i++) {
        items.add(selectedItems.keyAt(i));
    }
    return items;
}