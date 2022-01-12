@java.lang.Override
public java.lang.String formatMessage(java.util.logging.LogRecord record) {
    java.lang.String output = "";
    output += record.getLoggerName();
    output += ": ";
    output += record.getMessage();
    output += "\n";
    return output;
}