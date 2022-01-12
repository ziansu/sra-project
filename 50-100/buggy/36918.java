@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot eventSnapshot : dataSnapshot.getChildren()) {
        tpdev.megaphone.db.Message m = eventSnapshot.getValue(tpdev.megaphone.db.Message.class);
        addMessToHist(m);
        add_message_marker(m);
        android.util.Log.d(tpdev.megaphone.MapsActivity.TAG, ("onDataChanged:" + (dataSnapshot.getKey())));
    }
}