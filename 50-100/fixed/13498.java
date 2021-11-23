private void invalidate() throws java.io.IOException, org.json.JSONException {
    kuzzle.dataCollectionFactory(getResources().getString(R.string.cabble_collection_users)).deleteDocument(self.getString("_id"));
    io.kuzzle.demo.demo_android.MapController.getSingleton(this).clearMap();
    if ((userRoom) != null)
        userRoom.unsubscribe();
    
    if ((rideRoom) != null)
        rideRoom.unsubscribe();
    
    if ((usersScope) != null)
        usersScope.unsubscribe();
    
    kuzzle.logout();
}