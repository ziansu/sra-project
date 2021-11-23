@java.lang.Override
public java.lang.String getDefaultCheckoutDate(java.lang.String dateFormat) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.set(java.util.Calendar.DATE, 1);
    return com.hotelurbano.helpers.DateParsetHelper.calendarToString(dateFormat, calendar);
}