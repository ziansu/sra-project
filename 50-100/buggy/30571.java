private void updateField(java.lang.String selectedDate) {
    java.lang.String[] dateParsed = selectedDate.split("-");
    editTextDate.setText(dateParsed[0]);
    editTextMonth.setText(dateParsed[1]);
    editTextYear.setText(dateParsed[2]);
}