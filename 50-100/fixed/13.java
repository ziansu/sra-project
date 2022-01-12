public void setField(java.lang.String field, java.lang.String value) throws java.io.IOException {
    if ((value != null) && ((value.contains("\n")) || (value.contains("\r")))) {
        throw new java.io.IOException("Field value contains new lines");
    }
    fields.put(field, value);
}