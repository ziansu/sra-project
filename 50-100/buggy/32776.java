public void onDateSet(android.widget.DatePicker view, int set_year, int set_month, int set_day) {
    month = set_month;
    day = set_day;
    year = set_year;
    date_button.setText((((((java.lang.String.valueOf(month)) + "/") + (java.lang.String.valueOf(day))) + "/") + (java.lang.String.valueOf(year))));
}