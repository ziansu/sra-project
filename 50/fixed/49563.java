public java.lang.String getField(int index) {
    if ((index >= 0) && (index < (field.length))) {
        return com.robin.general.io.RecordParser.stripEndQuotes(field[index]);
    }
    return "";
}