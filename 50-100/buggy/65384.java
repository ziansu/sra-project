@java.lang.Override
public void onDateChanged(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    org.joda.time.LocalDate dateTime = new org.joda.time.LocalDate(year, month, dayOfMonth);
    if (dateTime.isAfter(maxDate)) {
        view.updateDate(maxDate.getYear(), ((maxDate.getMonthOfYear()) - 1), maxDate.getDayOfMonth());
    }
}