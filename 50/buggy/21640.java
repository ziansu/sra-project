@java.lang.Override
public void onSuccess(java.lang.String operationId, android.os.Bundle data) {
    org.techteam.decider.util.Toaster.toast(getApplicationContext(), "GetUser: ok");
    retrieveUserTask = new org.techteam.decider.gui.activities.MainActivity.RetrieveUserTask();
    retrieveUserTask.execute();
}