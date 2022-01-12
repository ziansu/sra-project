public static java.lang.Integer toInteger(java.lang.Object value) throws org.apache.commons.configuration2.ex.ConversionException {
    java.lang.Number n = org.apache.commons.configuration2.convert.PropertyConverter.toNumber(value, java.lang.Integer.class);
    if (n instanceof java.lang.Integer) {
        return ((java.lang.Integer) (n));
    }else {
        return new java.lang.Integer(n.intValue());
    }
}