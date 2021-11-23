public void refreshDrawer() {
    java.util.List<java.lang.String> val = com.amaze.filemanager.utils.DataUtils.getStorages();
    if (val == null)
        val = getStorageDirectories();
    
    createDrawerItems(com.amaze.filemanager.utils.DataUtils.getAccounts(), com.amaze.filemanager.utils.DataUtils.getServers(), val);
}