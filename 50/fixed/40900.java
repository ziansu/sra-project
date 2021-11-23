@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    editNamsinh.setText(java.lang.String.valueOf(((((dayOfMonth + "/") + (monthOfYear + 1)) + "/") + year)));
}