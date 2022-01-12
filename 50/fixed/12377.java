@java.lang.Override
public java.lang.Object get(java.lang.String key) {
    synchronized(varFileConfig) {
        return varFileConfig.get(key);
    }
}