public void onSave(android.view.View view) {
    java.lang.String name = contactName.getText().toString();
    java.lang.String phoneNumber = contactNumber.getText().toString();
    java.lang.String email = contactEmail.getText().toString();
    java.lang.String address = contactAddress.getText().toString();
    com.zouag.contacts.models.Contact newContact = validateFields(name, phoneNumber, email, address);
    if (newContact != null) {
        databaseAdapter.insertContact(newContact);
        setResult(com.zouag.contacts.ui.RESULT_OK);
        finish();
    }
}