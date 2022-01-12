public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    java.lang.String date = ((((java.lang.Integer.toString(year)) + "-") + (java.lang.Integer.toString((month + 1)))) + "-") + (java.lang.Integer.toString(day));
    if ((listener) != null)
        listener.returnDate(date);
    
}