@java.lang.Override
protected void updateItem(final java.lang.String item, final boolean empty) {
    super.updateItem(item, empty);
    if ((item == null) || empty) {
        setText(null);
    }else {
        javafx.scene.text.Text text = new javafx.scene.text.Text(item);
        text.wrappingWidthProperty().bind(getTableColumn().widthProperty());
        setGraphic(text);
    }
}