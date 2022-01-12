@javax.annotation.Nullable
@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getConstants() {
    android.util.Log.d(LOG_TAG, "Getting constants");
    jobScheduler = ((android.app.job.JobScheduler) (getReactApplicationContext().getSystemService(Context.JOB_SCHEDULER_SERVICE)));
    mJobs = jobScheduler.getAllPendingJobs();
    mInitialized = true;
    java.util.HashMap<java.lang.String, java.lang.Object> constants = new java.util.HashMap<>();
    constants.put("jobs", _getAll());
    return constants;
}