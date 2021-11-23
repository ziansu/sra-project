private boolean isKeyChanged(java.lang.String pathName) {
    java.util.Properties storageProperties = storageLoad.loadProperties();
    java.lang.String previousPath = storageProperties.getProperty(org.jimple.planner.Constants.PROPERTIES_KEY_CURRENT_SAVEPATH);
    if (previousPath.equals(pathName)) {
        return false;
    }else
        if (isValueSame(pathName, previousPath)) {
            setIfOrigin(pathName, previousPath);
            return false;
        }else {
            storageProperties.setProperty(org.jimple.planner.Constants.PROPERTIES_KEY_PREV_SAVEPATH, previousPath);
            storageProperties.setProperty(org.jimple.planner.Constants.PROPERTIES_KEY_CURRENT_SAVEPATH, pathName);
            return true;
        }
    
}