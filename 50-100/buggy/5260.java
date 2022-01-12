protected java.lang.String getExecutionTime(de.metanome.backend.results_db.Execution execution) {
    long time = (execution.getEnd()) - (execution.getBegin());
    com.google.gwt.i18n.client.DateTimeFormat format = com.google.gwt.i18n.client.DateTimeFormat.getFormat("HH:mm:ss.SSS");
    java.util.Date date = new java.util.Date(java.lang.Math.round((time / 1000000.0)));
    return format.format(date, com.google.gwt.i18n.client.TimeZone.createTimeZone(0));
}