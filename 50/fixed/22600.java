@java.lang.Override
public java.lang.String require(java.lang.String key, java.lang.Object... params) {
    return requireProperty(key, params, this, true, urlsConfig, overrides, ophProperties, defaults);
}