@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot != null) && ((dataSnapshot.getValue()) != null)) {
        fetchUserList(reference, dataSnapshot.getChildrenCount(), listener);
    }
}