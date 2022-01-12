private void updateField(java.lang.String selectedDate) {
    java.lang.String[] dateParsed = selectedDate.split("-");
    this.editTextDate.setText(dateParsed[0]);
    this.editTextMonth.setText(dateParsed[1]);
    this.editTextYear.setText(dateParsed[2]);
}