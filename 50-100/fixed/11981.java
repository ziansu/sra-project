public void execute() {
    view.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
    if (ppPanel.getOptDatabaseSelected()) {
        executePostgis();
    }else {
        executeDbf();
    }
    view.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
}