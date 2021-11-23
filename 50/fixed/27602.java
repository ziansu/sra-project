public java.lang.String getFieldName() {
    if ((this.fieldName) != null) {
        return this.fieldName;
    }
    return this.fieldName = this.field.getName().qualified;
}