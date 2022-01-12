@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    this.year = year;
    this.month = month;
    this.day = dayOfMonth;
    int displayMonth = (this.month) + 1;
    editTextDate.setText(((((displayMonth + "/") + (this.day)) + "/") + (this.year)));
}