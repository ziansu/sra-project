@java.lang.Override
public java.lang.String valueToString(final java.lang.Object value) throws java.text.ParseException {
    if (value == null) {
        return "";
    }
    final java.lang.String string = format.format(value);
    return string;
}