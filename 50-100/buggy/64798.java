private void refreshList() {
    yellowzebra.ui.ParserUI.lblStatus.setText("Reading e-mails from the server");
    this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
    btnRefresh.setEnabled(false);
    yellowzebra.ui.ParserController.refreshMailList();
    btnRefresh.setEnabled(true);
    this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    yellowzebra.ui.ParserUI.lblStatus.setText("Ready");
}