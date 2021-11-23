private void checkDeleteAndBrowseStatus() {
    if ((tableModel.getRowCount()) == 0) {
        browse.setEnabled(false);
        delete.setEnabled(false);
    }else {
        browse.setEnabled(true);
        delete.setEnabled(true);
    }
}