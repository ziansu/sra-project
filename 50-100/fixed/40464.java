public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    date.setText((((((java.lang.Integer.toString((monthOfYear + 1))) + "/") + (java.lang.Integer.toString(dayOfMonth))) + "/") + (java.lang.Integer.toString(year))));
}