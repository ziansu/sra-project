@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    strUserCode = dataSnapshot.getValue().toString();
}