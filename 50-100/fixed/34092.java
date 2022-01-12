@java.lang.Override
public void run() {
    try {
        java.util.Date m3b = getFirstOfMonth(addToDate(getFirstOfMonth(getDate(getDateDebut())), java.util.Calendar.MONTH, (-3)));
        textFieldBegin.setText(getDate(m3b));
        showCalendar();
    } catch (java.text.ParseException e) {
    }
}