@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int years, int monthOfYear, int dayOfMonth) {
    year = years;
    month = monthOfYear + 1;
    day = dayOfMonth;
    button.setText((((((month) + "/") + (day)) + "/") + (year)));
}