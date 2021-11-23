public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    startYear = year;
    startMonth = monthOfYear;
    startDay = dayOfMonth;
    tvStartDate.setText((((((startDay) + "/") + (startMonth)) + "/") + (startYear)));
}