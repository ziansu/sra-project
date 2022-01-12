private void installComboBox() {
    javafx.scene.control.ComboBox<T> comboBox = new javafx.scene.control.ComboBox<>(getItems());
    comboBox.converterProperty().bind(converterProperty());
    comboAlias = comboBox;
    comboBox.editableProperty().bind(comboBoxEditableProperty());
    comboBox.setMaxWidth(java.lang.Double.MAX_VALUE);
    de.swingempire.fx.scene.control.cell.XComboBoxTableCell.invokeSetFieldValue(javafx.scene.control.cell.ComboBoxTableCell.class, this, "comboBox", comboBox);
    comboBox.skinProperty().addListener(( src, ov, nv) -> {
        installComboListeners(comboBox);
    });
}