private void formatCellIfNotEmpty(java.lang.String item, javafx.scene.control.TableCell<udo.storage.Task, java.lang.String> tableCell) {
    if (!(tableCell.isEmpty())) {
        formatCellText(item, tableCell);
    }
}