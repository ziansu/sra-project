@java.lang.Override
public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
    java.lang.String date = (((year + "-") + (java.lang.String.format("%02d", (monthOfYear + 1)))) + "-") + (java.lang.String.format("%02d", dayOfMonth));
    android.util.Log.w(this.getLocalClassName(), ("You picked the following date: " + date));
    getAttributeFragment().updateAttributeValue(3, date);
    this.date = date;
}