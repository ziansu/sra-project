public void setItems(java.util.ArrayList<T> items) {
    this.items = items;
    listBox.clear();
    listBox.addItem(nullText, "");
    if (items != null) {
        for (T item : items) {
            listBox.addItem(item.getDisplayName(), item.getName());
        }
    }
}