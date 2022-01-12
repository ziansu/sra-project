public void deletebtn(android.view.View view) {
    android.widget.Toast.makeText(getApplicationContext(), "Please remove old Shortcut from home screen. AutoSMS will no longer remember it.", Toast.LENGTH_LONG).show();
    java.lang.System.out.println(("Id is " + (id)));
    com.abezukor.abezukor.autosms.DBHandler dbHandler = new com.abezukor.abezukor.autosms.DBHandler(this, null, null, 1);
    dbHandler.delete(((id) - 1));
    android.content.Intent intent = new android.content.Intent(this, com.abezukor.abezukor.autosms.ListViewActivity.class);
    intent.putExtra("button pressed", buttonpressed);
    startActivity(intent);
}