@java.lang.Override
public void onChildChanged(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    if ((dataSnapshot.getValue().equals("Receive")) || (dataSnapshot.getValue().equals("Friend"))) {
        java.lang.System.out.println(("dataSnapshot add onChildChanged" + (dataSnapshot.getKey())));
        locationKeyMap.remove(dataSnapshot.getKey());
        checkAdapter();
    }
}