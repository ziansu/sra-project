@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    if (!(error.isNetworkError())) {
        if ((error.getResponse().getStatus()) == 409) {
            dbHandler.UpdateSyncState_JobStatusChangeObj(obj, 1);
        }else {
            dbHandler.UpdateSyncState_JobStatusChangeObj(obj, (-5));
        }
    }else
        if (error.isNetworkError()) {
            dbHandler.UpdateSyncState_JobStatusChangeObj(obj, 0);
        }
    
}