private java.lang.String getExecutionTimeString(java.lang.String algorithmFileName, long executionTime) {
    com.google.gwt.i18n.client.DateTimeFormat format = com.google.gwt.i18n.client.DateTimeFormat.getFormat("HH:mm:ss.SSS");
    java.util.Date date = new java.util.Date(executionTime);
    return ((((("Algorithm " + algorithmFileName) + " executed in ") + (format.format(date, com.google.gwt.i18n.client.TimeZone.createTimeZone(0)))) + " (HH:mm:ss.SSS) or ") + executionTime) + " ms.";
}