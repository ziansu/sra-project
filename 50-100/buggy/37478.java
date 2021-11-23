public void onDateSet(android.widget.DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {
    eddob.setText(((((selectedday + "/") + selectedmonth) + "/") + selectedyear));
    birthdate = new org.joda.time.LocalDate(selectedyear, selectedmonth, selectedday);
    bdt = birthdate.toDateTimeAtStartOfDay().toDateTime();
}