public static synchronized org.jivesoftware.spark.PluginManager getInstance() {
    if (null == (org.jivesoftware.spark.PluginManager.singleton)) {
        org.jivesoftware.spark.PluginManager.singleton = new org.jivesoftware.spark.PluginManager();
    }
    return org.jivesoftware.spark.PluginManager.singleton;
}