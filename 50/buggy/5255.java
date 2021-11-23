@java.lang.Override
public java.lang.String lookup(java.lang.String key) {
    java.lang.String replacement = java.lang.System.getProperty(key);
    if (replacement == null) {
        java.lang.System.getenv(key);
    }
    return replacement;
}