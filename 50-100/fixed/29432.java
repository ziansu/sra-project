@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    if ((notif_id) > 30000)
        notif_id = 0;
    
    notif_id = (notif_id) + 1;
    if (dataSnapshot.child("seen").exists()) {
        showNotifications(dataSnapshot.child("friend_name").getValue().toString(), "went to supermarket", dataSnapshot.child("list_ref").getValue().toString());
        dataSnapshot.child("seen").getRef().removeValue();
    }
}