@java.lang.Override
public java.lang.String format(java.util.logging.LogRecord record) {
    java.lang.String message = record.getMessage();
    if (((anonymize) != null) && (message != null)) {
        message = anonymize.matcher(message).replaceAll("");
    }
    return message + (java.lang.System.lineSeparator());
}