@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    java.lang.String s = (contact_id_from_Main) + "";
    org.litepal.crud.DataSupport.deleteAll(com.example.administrator.contacts.contacts_file.MyContacts.class, "id=?", s);
    android.content.Intent intent = new android.content.Intent();
    setResult(com.example.administrator.contacts.RESULT_OK, intent);
    finish();
}