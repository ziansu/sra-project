@java.lang.Override
public java.lang.String lookup(java.lang.String key) {
    java.lang.String replacement = java.lang.System.getProperty(key);
    if (replacement == null) {
        replacement = java.lang.System.getenv(key);
    }
    return replacement;
}