@java.lang.Override
public T convert(java.lang.String value) {
    try {
        return ((T) (factory.invoke(null, value)));
    } catch (java.lang.Exception e) {
        throw new org.apache.tamaya.ConfigException(((("Invalid enum value '" + value) + "' for ") + (enumType.getName())));
    }
}