protected static void loadData(hudson.plugins.disk_usage.DiskUsageProperty property, boolean loadAllBuilds) {
    if (loadAllBuilds) {
        try {
            property.getDiskUsage().loadAllBuilds(loadAllBuilds);
        } catch (java.io.IOException ex) {
            java.util.logging.Logger.getLogger(hudson.plugins.disk_usage.DiskUsageUtil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }else {
        property.loadDiskUsage();
    }
}