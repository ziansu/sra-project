@java.lang.Override
public java.lang.String getOrElse(java.lang.String key, java.lang.String defaultValue, java.lang.Object... params) {
    return resolveProperty(key, defaultValue, params, this, urlsConfig, overrides, ophProperties, defaults);
}