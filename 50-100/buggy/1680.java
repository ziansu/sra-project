public void reDrawTable(orgomg.cwm.objectmodel.core.ModelElement[] columns, boolean withData) {
    if (((tablePanel) != null) && (!(tablePanel.isDisposed()))) {
        tablePanel.dispose();
    }
    needLoadData = withData;
    try {
        createNatTable(columns, withData);
        drawCanvas.layout();
    } catch (java.sql.SQLException e) {
        org.eclipse.jface.dialogs.MessageDialog.openWarning(null, org.talend.dataquality.record.linkage.ui.i18n.internal.DefaultMessagesImpl.getString("ColumnAnalysisDataSamTable.InValidWhereClause"), e.getMessage());
        needLoadData = false;
    }
}