private boolean isAccessible(org.araqne.logdb.query.command.StorageObjectName name) {
    if ((query) == null)
        return true;
    
    return accountService.checkPermission(query.getContext().getSession(), name.getTable(), Permission.READ);
}