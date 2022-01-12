@java.lang.Override
public void onClick(android.view.View view) {
    if (permissions.getPermission()) {
        kobeissidev.autobirthday.Settings.loadContacts(getApplicationContext(), dbHandler);
        android.widget.Toast toast = android.widget.Toast.makeText(getApplicationContext(), "Contacts are loaded!", Toast.LENGTH_SHORT);
        toast.show();
        setResult(0);
        finish();
    }
}