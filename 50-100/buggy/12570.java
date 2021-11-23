private boolean contains(java.lang.Object field, java.lang.Object value) {
    if (field == null) {
        return (value.equals("")) || (value == null);
    }
    return field.toString().contains(value.toString());
}