@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    dates = ((((java.lang.Integer.toString(year)) + "/") + (java.lang.Integer.toString(monthOfYear))) + "/") + (java.lang.Integer.toString(dayOfMonth));
}