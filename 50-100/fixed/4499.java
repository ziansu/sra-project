@java.lang.Override
public void onRightCardExit(java.lang.Object dataObject) {
    if ((list.size()) < 0)
        android.widget.Toast.makeText(this, "no more users!", Toast.LENGTH_LONG).show();
    else {
        com.bnutalk.ui.AddContactsActivity.makeToast(this, "like");
        new com.bnutalk.server.AHttpAddContacts(list, uid, handler, helper).rightOperation(cuid);
    }
}