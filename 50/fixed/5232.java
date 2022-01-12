@java.lang.Override
public void onClick(android.view.View v) {
    try {
        manageRideProposal(RideAction.FINISHED);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}