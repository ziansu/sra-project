@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError databaseError, com.google.firebase.database.DatabaseReference databaseReference) {
    if (databaseError != null) {
        android.widget.Toast.makeText(this, R.string.account_created, Toast.LENGTH_SHORT).show();
    }
}