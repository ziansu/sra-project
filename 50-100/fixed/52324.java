@java.lang.Override
protected javax.mail.Address convertToType(java.lang.reflect.Type targetType, java.lang.Object value) {
    if (value == null) {
        return null;
    }
    javax.mail.Address address;
    try {
        address = javax.mail.internet.InternetAddress.parse(value.toString())[0];
    } catch (javax.mail.internet.AddressException e) {
        throw new org.xwiki.properties.converter.ConversionException(java.lang.String.format("Failed to convert [%s] to [%s]", value, javax.mail.Address.class.getName()), e);
    }
    return address;
}