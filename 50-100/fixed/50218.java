@java.lang.Override
public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
    dateTimeSelected = dateTimeSelected.withYear(year).withMonthOfYear((monthOfYear + 1)).withDayOfMonth(dayOfMonth);
    com.wdullaer.materialdatetimepicker.time.TimePickerDialog timePicker = com.wdullaer.materialdatetimepicker.time.TimePickerDialog.newInstance(this, dateTimeSelected.getHourOfDay(), dateTimeSelected.getMinuteOfHour(), true);
    timePicker.setThemeDark(true);
    timePicker.show(getFragmentManager(), getResources().getText(R.string.text_pick_time).toString());
}