public void fnUpdateTree(java.lang.String pattern) {
    if (ti.isUseDefaultDir()) {
        this.treeModel = hk.org.ha.fmk.promotionhelper.ui.serverlog.view.widget.AccessLogFileTreeModelHelper.getFileTreeModel(Constants.LOG_DEFAULT_DOWNLOAD_FOLDER, pattern);
    }else {
        this.treeModel = hk.org.ha.fmk.promotionhelper.ui.serverlog.view.widget.AccessLogFileTreeModelHelper.getFileTreeModel(getCustomFolderPathString(), pattern);
    }
    fnSetTreeModel(this.treeModel);
}