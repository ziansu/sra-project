@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    android.util.Log.d(com.usal.jorgeav.sportapp.network.FirebaseDatabaseActions.TAG, dataSnapshot.toString());
    android.util.Log.d(com.usal.jorgeav.sportapp.network.FirebaseDatabaseActions.TAG, ((dataSnapshot.exists()) + ""));
    if (dataSnapshot.exists()) {
        com.usal.jorgeav.sportapp.data.Event event = com.usal.jorgeav.sportapp.Utiles.datasnapshotToEvent(dataSnapshot);
        android.content.ContentValues cv = com.usal.jorgeav.sportapp.Utiles.eventToContentValues(event);
        android.util.Log.d(com.usal.jorgeav.sportapp.network.FirebaseDatabaseActions.TAG, context.getContentResolver().insert(SportteamContract.EventEntry.CONTENT_EVENT_URI, cv).toString());
    }
}