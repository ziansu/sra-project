@java.lang.Override
public void onClick(android.view.View v) {
    findViewById(R.id.notification).setVisibility(View.GONE);
    io.kuzzle.demo.demo_android.MapController.getSingleton(this).makeMarkerStopBlinking();
    try {
        manageRideProposal(RideAction.DECLINED);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    } catch (io.kuzzle.sdk.exceptions.KuzzleException e) {
        e.printStackTrace();
    }
}