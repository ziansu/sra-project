@java.lang.SuppressWarnings(value = "deprecation")
public static java.util.Date getDateWithTime(java.util.Date date, java.lang.String time) {
    java.util.Date result;
    try {
        result = org.opencms.gwt.client.ui.input.datebox.CmsDateConverter.Z_TIME_FORMAT.parse(time);
        result.setDate(date.getDate());
        result.setMonth(date.getMonth());
        result.setYear(date.getYear());
    } catch (java.lang.Exception e) {
        result = null;
    }
    return result;
}