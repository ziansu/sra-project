public static java.lang.Long toLong(java.lang.Object value) throws org.apache.commons.configuration2.ex.ConversionException {
    java.lang.Number n = org.apache.commons.configuration2.convert.PropertyConverter.toNumber(value, java.lang.Long.class);
    if (n instanceof java.lang.Long) {
        return ((java.lang.Long) (n));
    }else {
        return new java.lang.Long(n.longValue());
    }
}