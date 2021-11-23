@java.lang.Override
public void onLeftCardExit(java.lang.Object dataObject) {
    if ((list.size()) < 0)
        android.widget.Toast.makeText(this, "no more users!", Toast.LENGTH_LONG).show();
    else
        com.bnutalk.ui.AddContactsActivity.makeToast(this, "dislike");
    
}