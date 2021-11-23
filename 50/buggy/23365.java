@java.lang.Override
public com.kepler.protocol.impl.DefaultRequest putIfAbsent(java.lang.String key, java.lang.String value) {
    this.headers.putIfAbsent(key, value);
    return this;
}