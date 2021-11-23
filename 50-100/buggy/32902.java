@java.lang.Override
public void onDataChange(final com.google.firebase.database.DataSnapshot dataSnapshot) {
    android.util.Log.e("Nery", "Changed..!");
    if ((activity) == null) {
        android.util.Log.e("ERROR", "activity es null");
    }
    if ((tabrisContext) == null) {
        android.util.Log.e("ERROR", "tabrisContext es null");
    }
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    remoteObject.notify("onDataChange", "data", dataSnapshot.getValue());
}