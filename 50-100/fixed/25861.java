@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int which) {
    java.lang.String placeID = selected.getPlaceID();
    android.support.v4.app.DialogFragment dialog = com.kappa_labs.ohunter.client.utilities.Wizard.getServerCommunicationDialog(this);
    com.kappa_labs.ohunter.client.utilities.ResponseTask task = new com.kappa_labs.ohunter.client.utilities.ResponseTask(dialog, this);
    task.execute(new com.kappa_labs.ohunter.lib.requests.RejectPlaceRequest(com.kappa_labs.ohunter.client.utilities.SharedDataManager.getPlayer(this), placeID, com.kappa_labs.ohunter.client.utilities.PointsManager.getRejectCost()));
}