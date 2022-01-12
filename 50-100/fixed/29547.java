public boolean canView(org.activityinfo.model.form.FormInstance record) {
    org.activityinfo.store.spi.FormPermissions formPermissions = supervisor.getFormPermissions(record.getFormId());
    if (!(formPermissions.isVisible())) {
        return false;
    }
    org.activityinfo.model.expr.ExprNode filter = parseFilter(record.getFormId(), formPermissions.getVisibilityFilter());
    return evalFilter(record, filter);
}