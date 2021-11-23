public void setSelectedItem(int itemId) {
    for (int i = 0; i < (listItems.size()); i++) {
        if ((listItems.get(i).getItemId()) == itemId) {
            selectedItemIndex = i;
        }
    }
    refreshList(false);
}