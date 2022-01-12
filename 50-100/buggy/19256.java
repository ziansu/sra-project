private void loadSpinnerData() {
    users = com.scottcrocker.packify.MainActivity.db.getAllUsers();
    android.widget.ArrayAdapter<com.scottcrocker.packify.model.User> dataAdapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_spinner_item, users);
    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mSpinner.setPrompt("Välj en användare...");
    mSpinner.setAdapter(new com.scottcrocker.packify.controller.NothingSelectedSpinnerAdapter(dataAdapter, R.layout.spinner_row_nothing_selected, this));
}