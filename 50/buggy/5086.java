@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError error) {
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    remoteObject.notify("onCancelled", "error", error.getMessage());
}