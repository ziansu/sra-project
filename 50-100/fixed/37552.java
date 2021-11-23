@java.lang.Override
public void onSuccess(org.json.JSONObject object) {
    try {
        currentRide = new io.kuzzle.sdk.core.KuzzleDocument(rideCollection, object);
        manageRideProposal();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}