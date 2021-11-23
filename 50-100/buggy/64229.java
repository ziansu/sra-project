private void removeSelectedButtonClicked() {
    for (int i = 0; i < (model.getRowCount()); ++i) {
        if (model.getValueAt(i, ((model.getColumnCount()) - 1)).equals(true)) {
            storage.removeProduct(((java.lang.Integer) (model.getValueAt(i, 0))));
            model.removeRow(i);
        }
    }
}