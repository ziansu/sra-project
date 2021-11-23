@Kroll.method
public void removeProperty(java.lang.String key) {
    if (keyExists(keyEncrypt(key))) {
        _provider.removeProperty(keyEncrypt(key));
        fireChanged(key, "removed");
    }
}