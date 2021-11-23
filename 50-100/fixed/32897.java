@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    year_x = year;
    month_x = monthOfYear;
    day_x = dayOfMonth;
    if (editTextCostsDate.callOnClick()) {
        editTextCostsDate.setText((((((day_x) + "-") + (month_x)) + "-") + (year_x)));
        return ;
    }
    if (editTextCosts.callOnClick()) {
        showMessage("lala", "lala");
        return ;
    }
}