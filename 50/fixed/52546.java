@java.lang.Override
protected void updateItem(java.lang.String item, boolean empty) {
    super.updateItem(item, empty);
    this.setText(GUIFormatter.EMPTY_STRING);
    formatCellIfNotEmpty(item, this);
    this.setText(item);
}