java.lang.String processArg(java.lang.String[] path, java.lang.String jsonArg) {
    java.lang.String keyArg = jsonArg;
    if ((path.length) > 0) {
        try {
            keyArg = processSubFieldsOfArg(path, jsonArg);
        } catch (java.lang.Throwable ex) {
            logger.warn("Fail to access to field for '{}'", jsonArg, ex);
        }
    }
    return keyArg;
}