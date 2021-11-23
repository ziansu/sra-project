private java.lang.Float getFieldAsFloat(java.lang.String value, java.lang.String fieldName) {
    try {
        return getFloat(value);
    } catch (java.lang.NumberFormatException e) {
        new org.device.demo.UserFormException("Incorrect number format at field \"%s\"", fieldName);
    }
    return null;
}