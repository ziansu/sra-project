private static void initDefaultProperties() {
    if ((eclox.core.doxyfiles.Setting.defaultProperties) == null) {
        try {
            java.io.InputStream propertiesInput = eclox.core.Plugin.class.getResourceAsStream("/misc/setting-properties.txt");
            eclox.core.doxyfiles.Setting.defaultProperties = new java.util.Properties();
            if (propertiesInput != null)
                eclox.core.doxyfiles.Setting.defaultProperties.load(propertiesInput);
            
        } catch (java.lang.Throwable throwable) {
            eclox.core.Plugin.log(throwable);
        }
    }
}