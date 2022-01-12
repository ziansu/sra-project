private boolean equals(java.lang.Object field, java.lang.Object value) {
    if (field == null) {
        return (value == null) || (value.equals(""));
    }
    return field.toString().equals(value);
}