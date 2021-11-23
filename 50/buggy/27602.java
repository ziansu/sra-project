public java.lang.String getFieldName() {
    if ((this.fieldName) != null) {
        return fieldName;
    }
    return this.fieldName = this.field.getName().qualified;
}