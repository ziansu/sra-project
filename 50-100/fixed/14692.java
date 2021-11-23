public boolean setValue(java.lang.Object value) {
    java.lang.String type = mSchemaNode.getString("type");
    if (((type.equalsIgnoreCase("string")) && (value instanceof java.lang.String)) || ((type.equalsIgnoreCase("integer")) && ((value instanceof java.lang.Long) || (value instanceof java.lang.Integer)))) {
        mJsonNode = value;
        return true;
    }
    return false;
}