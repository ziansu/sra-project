@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_logout :
            com.google.firebase.database.FirebaseDatabase database = com.google.firebase.database.FirebaseDatabase.getInstance();
            com.google.firebase.database.DatabaseReference myRef = database.getReference("message");
            myRef.setValue("Logging Out");
            com.google.firebase.auth.FirebaseAuth.getInstance().signOut();
            com.facebook.login.LoginManager.getInstance().logOut();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}