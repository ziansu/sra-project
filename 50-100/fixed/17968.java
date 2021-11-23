@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.EditText editName = ((android.widget.EditText) (findViewById(R.id.contact_edit_name)));
    mContact.setName(editName.getText().toString());
    mContact.phoneNumbers.clear();
    mContact.emails.clear();
    mContact.phoneNumbers.addAll(getSectionValues(R.id.phoneNumber_section));
    mContact.emails.addAll(getSectionValues(R.id.email_section));
    android.widget.Toast.makeText(this, "Saved Contact", Toast.LENGTH_LONG).show();
    finish();
}