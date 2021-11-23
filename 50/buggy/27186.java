public T get() {
    try {
        return getValue(getRawValue());
    } catch (fr.zcraft.zlib.components.configuration.ConfigurationParseException ex) {
        return defaultValue;
    }
}