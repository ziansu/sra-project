@java.lang.Override
public boolean handle(java.lang.Object data) {
    org.talend.core.model.metadata.builder.connection.Connection conn = ((org.talend.core.model.metadata.builder.connection.Connection) (data));
    if (org.talend.cwm.db.connection.ConnectionUtils.checkConnection(conn)) {
        openColumnsSelectionDialog(conn);
    }else {
        org.talend.cwm.db.connection.ConnectionUtils.openWarningForCheckConnection(getAnalysisHandler().getAnalysis().getName());
    }
    return true;
}