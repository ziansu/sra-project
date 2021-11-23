@java.lang.Override
public void onChildRemoved(com.teachwithapps.weconomyexperience.model.ScheduledInstructionData data) {
    updateLoadingState(callback, com.teachwithapps.weconomyexperience.FireDatabaseTransactions.LoadState.LOADING_DONE);
    callback.onChildAdded(data);
}