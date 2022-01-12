@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    month++;
    dateSelected = (((dayOfMonth + "/") + month) + "/") + year;
    ((android.widget.Button) (v)).setText(dateSelected);
    isDateSet = true;
}