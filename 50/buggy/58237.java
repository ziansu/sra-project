@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    android.util.Log.w(taylorandtanner.gasscanmk1.MainActivity.TAG, "loadPost:onCancelled", databaseError.toException());
}