@java.lang.Override
public com.kepler.protocol.impl.DefaultRequest put(java.lang.String key, java.lang.String value) {
    if ((this.headers) != null) {
        this.headers.put(key, value);
    }
    return this;
}