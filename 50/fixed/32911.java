@java.lang.Override
public java.lang.Object stringToValue(final java.lang.String text) throws java.text.ParseException {
    final java.lang.Object value = format.parseObject(text);
    return value;
}