@java.lang.Override
public void onBindViewHolder(com.mog.kontax.kontax.ContactListAdapter.ContactListAdapterViewHolder contactListAdapterViewHolder, int position) {
    android.util.Log.d(com.mog.kontax.kontax.ContactListAdapter.TAG, ("#" + position));
    com.mog.kontax.kontax.Contact contact = mContacts[position];
    java.lang.String[] firstAndLastName = contact.getName().split(" ", 2);
    java.lang.String firstName = firstAndLastName[0];
    contactListAdapterViewHolder.firstNameTextView.setText(firstName);
    if ((firstAndLastName.length) > 1) {
        java.lang.String lastName = firstAndLastName[1];
        contactListAdapterViewHolder.lastNameTextView.setText(lastName);
    }
}