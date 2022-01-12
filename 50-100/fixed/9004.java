private java.lang.StringBuilder log(java.lang.String level, java.lang.Object message) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(com.kk.utils.log.ConsoleLogger.formatDefaultTimestamp);
    java.lang.String time = format.format(new java.util.Date());
    sb.append(time);
    sb.append(" ");
    sb.append(level);
    sb.append(" ");
    sb.append(getFileNameAndLineNumber());
    sb.append(" - ");
    sb.append(message);
    return sb;
}