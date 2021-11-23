@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    android.util.Log.v(edu.uw.samueldc.assassin_manager.MainActivity.TAG, ("users: " + (dataSnapshot.getValue())));
}