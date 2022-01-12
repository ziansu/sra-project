private void showDatePickerDialog() {
    android.app.DatePickerDialog datePickerDialog = new android.app.DatePickerDialog(getContext(), new android.app.DatePickerDialog.OnDateSetListener() {
        @java.lang.Override
        public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            txt_dateselected.setText(getDateFormate(year, (monthOfYear + 1), dayOfMonth));
        }
    }, mYear, mMonth, mDay);
    datePickerDialog.show();
}