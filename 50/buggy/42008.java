@java.lang.Override
public void removeProperty(java.lang.String key) {
    if (keyExists(key)) {
        _appProperties.removeProperty(key);
    }
}