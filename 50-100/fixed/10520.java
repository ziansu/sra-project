@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    monthOfYear = monthOfYear + 1;
    dates = ((((java.lang.Integer.toString(dayOfMonth)) + "/") + (java.lang.Integer.toString(monthOfYear))) + "/") + (java.lang.Integer.toString(year));
}