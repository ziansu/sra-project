@java.lang.Override
public java.lang.Object get(java.lang.Object key) {
    java.lang.Object value = null;
    if ((value == null) && (key instanceof java.lang.String)) {
        java.lang.String keyStr = ((java.lang.String) (key));
        if (varFileConfig.contains(keyStr)) {
            value = varFileConfig.get(keyStr);
        }
    }
    return value;
}