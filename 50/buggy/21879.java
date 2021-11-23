@java.lang.Override
public java.lang.String valueToString(final java.lang.Object value) throws java.text.ParseException {
    if (value == null) {
        return "";
    }
    return format.format(value);
}