private void checkDeleteAndBrowseStatus() {
    if ((tableModel.getRowCount()) == 0) {
        browse.setEnabled(false);
        delete.setEnabled(false);
        hideFileArgsMainPanel(java.lang.Boolean.FALSE);
    }else {
        browse.setEnabled(true);
        delete.setEnabled(true);
        hideFileArgsMainPanel(java.lang.Boolean.TRUE);
    }
}