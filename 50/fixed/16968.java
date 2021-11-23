public void notifySelectedValue(java.lang.String value) {
    this.lastSelectedEditableCellView.changeValue(value);
    changeModelCellValue(value);
}