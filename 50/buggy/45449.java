public context.healthinformatics.parser.Column getColumn() {
    context.healthinformatics.parser.Column col = new context.healthinformatics.parser.Column(getColumnIDValue(), getColumnNameValue(), getColumnTypeValue());
    if (hasDateType()) {
        col.setDateType(getColumnDateTypeValue());
    }
    return col;
}