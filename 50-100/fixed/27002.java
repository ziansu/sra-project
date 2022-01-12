public void process(boolean load) {
    if (load) {
        configFile.load();
    }
    try {
        for (java.lang.reflect.Field f : configs.getDeclaredFields()) {
            processField(f);
        }
        if ((callback) != null) {
            callback.callback(this);
        }
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
    configFile.save();
}