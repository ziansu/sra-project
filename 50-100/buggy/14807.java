@java.lang.Override
public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog datePickerDialog, int year, int month, int day) {
    fromCalendar.set(year, month, day);
    tvFromDate.setText((((((month + 1) + "/") + day) + "/") + year));
}