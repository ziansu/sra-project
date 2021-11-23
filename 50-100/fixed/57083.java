@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int day) {
    ((android.widget.Button) (findViewById(R.id.geburtstagButton))).setText(((((day + ".") + (month + 1)) + ".") + year));
    this.day = day;
    this.month = month;
    this.year = year;
}