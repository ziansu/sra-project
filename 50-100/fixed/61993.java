public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mDay = dayOfMonth;
    mMonth = monthOfYear + 1;
    editText.setText((((java.lang.String.valueOf(dayOfMonth)) + "/") + (java.lang.String.valueOf((monthOfYear + 1)))));
}