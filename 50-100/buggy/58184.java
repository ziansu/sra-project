java.lang.String processArg(java.lang.String[] path, java.lang.String jsonArg) {
    java.lang.String keyArg = jsonArg;
    if ((path.length) > 1) {
        java.lang.String[] subpath = java.util.Arrays.copyOfRange(path, 1, path.length);
        try {
            keyArg = processSubFieldsOfArg(subpath, jsonArg);
        } catch (java.lang.Throwable ex) {
            logger.warn("Fail to access to field for '{}'", jsonArg, ex);
        }
    }
    return keyArg;
}