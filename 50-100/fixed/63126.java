@java.lang.Override
public boolean containsKey(java.lang.Object key) {
    boolean result = false;
    if ((!result) && (key instanceof java.lang.String)) {
        java.lang.String keyStr = ((java.lang.String) (key));
        synchronized(varFileConfig) {
            result = varFileConfig.contains(keyStr);
        }
    }
    return result;
}