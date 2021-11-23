public void clearSelection() {
    for (int i = 0; i <= (selectedItems.size()); i++) {
        if (selectedItems.get(i)) {
            selectedItems.put(i, false);
            notifyItemChanged(i);
        }
    }
}