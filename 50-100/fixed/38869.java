public static java.lang.Short toShort(java.lang.Object value) throws org.apache.commons.configuration2.ex.ConversionException {
    java.lang.Number n = org.apache.commons.configuration2.convert.PropertyConverter.toNumber(value, java.lang.Short.class);
    if (n instanceof java.lang.Short) {
        return ((java.lang.Short) (n));
    }else {
        return n.shortValue();
    }
}