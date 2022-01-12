public static com.force.sdk.jpa.query.entities.date.DateTestEntity init(java.lang.String name, java.util.Date date) {
    com.force.sdk.jpa.query.entities.date.DateTestEntity dte = new com.force.sdk.jpa.query.entities.date.DateTestEntity();
    dte.setName(name);
    java.util.Calendar cal = null;
    if (date != null) {
        cal = java.util.Calendar.getInstance();
        cal.setTime(date);
    }
    dte.setDate(cal);
    return dte;
}