@java.lang.Override
public void onSuccess(java.lang.String operationId, android.os.Bundle data) {
    retrieveUserTask = new org.techteam.decider.gui.activities.MainActivity.RetrieveUserTask();
    retrieveUserTask.execute();
}