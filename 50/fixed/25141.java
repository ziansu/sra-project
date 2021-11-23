@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) != null) {
        strUserCode = dataSnapshot.getValue().toString();
    }
}