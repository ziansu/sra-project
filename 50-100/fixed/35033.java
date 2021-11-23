public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    android.util.Log.d("MVC", "Date has been set");
    etSignupBirthday.setText((((((month + 1) + "/") + day) + "/") + year));
}