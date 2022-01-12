@java.lang.Override
public java.util.List<org.eclipse.scout.rt.shared.services.lookup.ILookupRow<T>> getDataByText(org.eclipse.scout.rt.shared.services.lookup.ILookupCall<T> call) throws org.eclipse.scout.commons.exception.ProcessingException {
    if ((call.getText()) != null) {
        java.lang.String s = call.getText();
        java.lang.String sqlWildcard = org.eclipse.scout.service.SERVICES.getService(org.eclipse.scout.rt.server.services.common.jdbc.ISqlService.class).getSqlStyle().getLikeWildcard();
        call.setText(s.replace(call.getWildcard(), sqlWildcard));
    }
    java.lang.String sql = getConfiguredSqlSelect();
    return execLoadLookupRows(sql, filterSqlByText(sql), call);
}