@java.lang.Override
public void onClick(android.view.View v) {
    com.addressbook.thorrism.addressbook.Contact contact = createContact();
    if (contact == null)
        android.util.Log.e(DroidBook.TAG, "Null");
    else {
        com.addressbook.thorrism.addressbook.DroidBook.hideKeyboard(mCurrentEdit, getApplicationContext());
        mBook.addEntry(contact);
        new com.addressbook.thorrism.addressbook.CreateContactScreen.SaveTask().execute();
    }
}