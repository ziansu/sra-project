private java.lang.String colored(java.lang.String message, org.fusesource.jansi.Ansi.Color color, boolean addPrefix, java.lang.Object... params) {
    org.fusesource.jansi.Ansi ansi = org.fusesource.jansi.Ansi.ansi().fg(color);
    java.lang.String msgToPrint = (addPrefix) ? (prefix) + message : message;
    return ansi.a(format(evaluateEmphasis(msgToPrint, color), params)).reset().toString();
}