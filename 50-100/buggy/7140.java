@java.lang.Override
public void startEdit() {
    super.startEdit();
    selected = treeView.getSelectionModel().getSelectedItem();
    graphic = selected.getGraphic();
    beforePath = selected.getValue();
    if ((editable) == null) {
        createTextField();
    }
    selected.setValue(java.nio.file.Paths.get(""));
    selected.setGraphic(editable);
    editable.selectAll();
}