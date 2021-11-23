@java.lang.Override
public void onChildAdded(com.google.firebase.database.DataSnapshot snapshot, java.lang.String previousChildName) {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap();
    map.put("child", snapshot.getKey());
    map.put("value", snapshot.getValue());
    com.eclipsesource.tabris.android.RemoteObject remoteObject = tabrisContext.getObjectRegistry().getRemoteObjectForObject(this);
    remoteObject.notify("onChildAdded", "child", snapshot.getValue());
}