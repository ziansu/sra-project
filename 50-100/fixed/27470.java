private void countSelectedItems() {
    int count = 0;
    for (int i = 0; i < (data.size()); i++) {
        if (this.selectedItems.get(i)) {
            count++;
        }
    }
    if (count > 0)
        this.itemsSelectedListener.itemsSelected(true);
    else
        this.itemsSelectedListener.itemsSelected(false);
    
}