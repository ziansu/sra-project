public static org.jivesoftware.spark.PluginManager getInstance() {
    synchronized(org.jivesoftware.spark.PluginManager.LOCK) {
        if (null == (org.jivesoftware.spark.PluginManager.singleton)) {
            org.jivesoftware.spark.PluginManager controller = new org.jivesoftware.spark.PluginManager();
            org.jivesoftware.spark.PluginManager.singleton = controller;
            return controller;
        }
    }
    return org.jivesoftware.spark.PluginManager.singleton;
}