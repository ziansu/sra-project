@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    dateSelected = ((((dayOfMonth + "/") + month) + 1) + "/") + year;
    ((android.widget.Button) (v)).setText(dateSelected);
    isDateSet = true;
}