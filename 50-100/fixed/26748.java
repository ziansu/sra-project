@java.lang.Override
public void run() {
    android.content.Context context = getReactApplicationContext();
    android.content.ContentResolver cr = context.getContentResolver();
    com.rt2zz.reactnativecontacts.ContactsProvider contactsProvider = new com.rt2zz.reactnativecontacts.ContactsProvider(cr);
    com.facebook.react.bridge.WritableMap contact = contactsProvider.getContactByPhoneNumber(phoneNumber);
    callback.invoke(null, contact);
}