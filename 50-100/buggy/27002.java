public void process(boolean load) {
    if (load) {
        configFile.load();
    }
    try {
        boolean fieldsChanged = false;
        for (java.lang.reflect.Field f : configs.getDeclaredFields()) {
            fieldsChanged |= processField(f);
        }
        if (fieldsChanged && ((callback) != null)) {
            callback.callback(this);
        }
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
    if (configFile.hasChanged()) {
        configFile.save();
    }
}