public void execute() {
    view.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
    java.lang.Boolean dbSelected = ppPanel.getOptDatabaseSelected();
    if (dbSelected) {
        executePostgis();
    }else {
        executeDbf();
    }
    view.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
}