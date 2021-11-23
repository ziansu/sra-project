@java.lang.Override
protected java.util.Date fromString(java.lang.String input) {
    for (java.text.SimpleDateFormat formatter : parsers) {
        try {
            synchronized(formatter) {
                return formatter.parse(input);
            }
        } catch (java.text.ParseException ex) {
        }
    }
    com.univocity.parsers.conversions.DataProcessingException exception = new com.univocity.parsers.conversions.DataProcessingException(("Cannot parse '{value}' as a valid date. Supported formats are: " + (java.util.Arrays.toString(formats))));
    exception.setValue(input);
    throw exception;
}