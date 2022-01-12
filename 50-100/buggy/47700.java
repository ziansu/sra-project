private java.lang.Object getValue(java.util.Properties attributes, java.lang.String attributeName) {
    final java.lang.String type = getType(attributeName);
    if ((type != null) && (type.equals("number"))) {
        return new java.lang.Integer(((java.lang.String) (attributes.get(attributeName))));
    }else {
        return attributes.get(attributeName);
    }
}