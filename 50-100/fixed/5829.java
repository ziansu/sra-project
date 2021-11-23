@java.lang.Override
public void addListenerForSingleValueEvent(final de.tomgrill.gdxfirebase.core.database.ValueEventListener listener) {
    query.addListenerForSingleValueEvent(new de.tomgrill.gdxfirebase.core.database.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
            listener.onDataChange(new de.tomgrill.gdxfirebase.android.database.AndroidDataSnapshot(dataSnapshot));
        }

        @java.lang.Override
        public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
            listener.onCancelled(new de.tomgrill.gdxfirebase.android.database.AndroidDatabaseError(databaseError));
        }
    });
}