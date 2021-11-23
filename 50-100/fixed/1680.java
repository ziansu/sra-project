public void reDrawTable(orgomg.cwm.objectmodel.core.ModelElement[] columns, boolean withData) {
    if (((tablePanel) != null) && (!(tablePanel.isDisposed()))) {
        tablePanel.dispose();
    }
    needLoadData = withData;
    try {
        createNatTable(columns, withData);
        drawCanvas.layout();
    } catch (java.sql.SQLException e) {
        needLoadData = false;
    }
}