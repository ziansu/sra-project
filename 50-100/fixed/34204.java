private boolean preventFolderAccess(java.net.URL target, java.lang.String path, act.app.ActionContext context) {
    if (folders.contains(target)) {
        AlwaysForbidden.INSTANCE.handle(context);
        return true;
    }
    if (isFolder(target, path)) {
        folders.add(target);
        AlwaysForbidden.INSTANCE.handle(context);
        return true;
    }
    return false;
}