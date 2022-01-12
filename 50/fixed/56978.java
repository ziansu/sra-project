public com.intetics.bean.FieldValue newValue(java.util.List<java.lang.String> values, com.intetics.bean.Field field) {
    com.intetics.bean.StringValue value = new com.intetics.bean.StringValue();
    if (value != null) {
        value.setValue(values.get(0));
    }
    return value;
}