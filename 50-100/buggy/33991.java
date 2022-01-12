private java.lang.String setDate(java.util.ArrayList<application.storage.Task> item) {
    java.lang.String date = null;
    if ((item.get(application.gui.CalendarViewPage.START).getEndDate()) != null) {
        date = application.gui.CalendarViewPage.FORMAT_DATE.format(item.get(application.gui.CalendarViewPage.START).getEndDate().getTime());
    }
    return date;
}