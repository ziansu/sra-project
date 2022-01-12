@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.widget.Toast.makeText(getApplicationContext(), (" RetrofitError " + (error.getMessage().toString())), Toast.LENGTH_LONG).show();
    if (!(error.isNetworkError())) {
        if ((error.getResponse().getStatus()) == 409) {
            dbHandler.UpdateSyncState_JobStatusChangeObj(obj, 1);
        }else {
            dbHandler.UpdateSyncState_JobStatusChangeObj(obj, (-5));
        }
    }
}