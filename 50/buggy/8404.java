@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getValue()) == null) {
        finish();
    }
    mSong = dataSnapshot.getValue(com.teinvdlugt.android.piano.Song.class);
    if ((mSong) != null)
        loadSong();
    
}