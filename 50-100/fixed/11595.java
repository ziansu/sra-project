@java.lang.Override
public <T> T loadClass(java.lang.Class<T> pluginClass) {
    java.lang.String id = classToBeanMap.get(pluginClass.getName());
    if (id != null) {
        return osgiPluginTracker.getBean(pluginClass, this, id);
    }else {
        try {
            return pluginClass.newInstance();
        } catch (java.lang.Exception e) {
            logger.error("Error instancing plugin class: ", e);
            return null;
        }
    }
}