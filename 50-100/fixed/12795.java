@java.lang.Override
public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int day) {
    dateList.add(((((((("" + (day < 10 ? '0' : "")) + day) + "/") + (month < 10 ? '0' : "")) + month) + "/") + year));
    showDialog(888);
}