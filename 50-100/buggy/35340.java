@java.lang.Override
public void onDateSet(com.fourmob.datetimepicker.date.DatePickerDialog datePickerDialog, int year, int month, int day) {
    month = month - 1;
    java.lang.String abc = ((((+year) + "-") + month) + "-") + day;
    android.widget.Toast.makeText(this, abc, Toast.LENGTH_LONG).show();
    editDate0.setText(abc);
}