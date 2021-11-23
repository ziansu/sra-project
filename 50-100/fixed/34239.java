private java.lang.String getErrorMessageForQuery(orgomg.cwm.objectmodel.core.Expression query) {
    if (query == null) {
        return org.talend.cwm.management.i18n.Messages.getString("ColumnAnalysisSqlParallelExecutor.QueryIsNull", indicator.getName());
    }else {
        return (org.talend.cwm.management.i18n.Messages.getString("ColumnAnalysisSqlParallelExecutor.QueryNotExecute", indicator.getName())) + (org.talend.cwm.management.i18n.Messages.getString("ColumnAnalysisSqlParallelExecutor.SQLQuery", query.getBody()));
    }
}