private void setGenderSpinner() {
    android.widget.ArrayAdapter<java.lang.String> spinnerAdapter = new android.widget.ArrayAdapter<java.lang.String>(this, R.layout.support_simple_spinner_dropdown_item, new java.lang.String[]{ "Gender" , "Male" , "Female" });
    spGender.setAdapter(spinnerAdapter);
}