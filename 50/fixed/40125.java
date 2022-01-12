@java.lang.Override
protected com.seafile.seadroid2.ui.dialog.DeleteTask prepareTask() {
    if ((dirents) != null) {
        return new com.seafile.seadroid2.ui.dialog.DeleteTask(repoID, path, dirents, getDataManager());
    }
    return new com.seafile.seadroid2.ui.dialog.DeleteTask(repoID, path, isdir, getDataManager());
}