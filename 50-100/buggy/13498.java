private void invalidate() throws io.kuzzle.sdk.exceptions.KuzzleException, java.io.IOException, org.json.JSONException {
    kuzzle.dataCollectionFactory(getResources().getString(R.string.cabble_collection_users)).deleteDocument(self.getString("_id"));
    io.kuzzle.demo.demo_android.MapController.getSingleton(this).clearMap();
    userRoom.unsubscribe();
    rideRoom.unsubscribe();
    usersScope.unsubscribe();
    kuzzle.logout();
}