private boolean preventFolderAccess(java.net.URL target, act.app.ActionContext context) {
    if (folders.contains(target)) {
        AlwaysForbidden.INSTANCE.handle(context);
        return true;
    }
    if (isFolder(target)) {
        folders.add(target);
        AlwaysForbidden.INSTANCE.handle(context);
        return true;
    }
    return false;
}