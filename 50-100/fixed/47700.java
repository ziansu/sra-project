private java.lang.Object getValue(java.util.Properties attributes, java.lang.String attributeName) {
    final java.lang.String type = getType(attributeName);
    final java.lang.String value = ((java.lang.String) (attributes.get(attributeName)));
    if (((type != null) && (type.equals("number"))) && (!(value.isEmpty()))) {
        return new java.lang.Integer(value);
    }else {
        return value;
    }
}