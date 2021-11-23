private <T> T getProperty(java.lang.String name, java.lang.String defaultValue, com.beust.jcommander.IStringConverter<T> converter, com.beust.jcommander.IParameterValidator validator) {
    java.lang.String value = properties.getProperty(name);
    if ((value == null) && (defaultValue != null)) {
        value = defaultValue;
    }
    if (validator != null) {
        validator.validate(name, value);
    }
    return value == null ? null : converter.convert(value);
}