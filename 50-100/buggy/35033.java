public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    android.util.Log.d("MVC", "Date has been set");
    etSignupBirthday.setText(((((day + "/") + (month + 1)) + "/") + year));
}