private java.lang.Integer getFieldAsInteger(java.lang.String value, java.lang.String fieldName) {
    try {
        return (value != null) && (!(value.isEmpty())) ? java.lang.Integer.valueOf(value) : null;
    } catch (java.lang.NumberFormatException e) {
        new org.device.demo.UserFormException("Incorrect number format at field \"%s\"", fieldName);
    }
    return null;
}