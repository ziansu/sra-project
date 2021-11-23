@java.lang.Override
public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
    java.lang.String fullDate;
    java.lang.String dayofmonth = "" + dayOfMonth;
    java.lang.String monthofyear = "" + (++monthOfYear);
    if (dayOfMonth < 10)
        dayofmonth = "0" + dayOfMonth;
    
    if ((++monthOfYear) < 10) {
        monthofyear = "0" + monthOfYear;
    }
    fullDate = (((year + "-") + monthofyear) + "-") + dayofmonth;
    mDates.setText(fullDate);
}