@java.lang.Override
public boolean onStartJob(android.app.job.JobParameters params) {
    android.util.Log.v(ca.rmen.android.poetassistant.wotd.WotdJobService.TAG, ("onStartJob: params " + params));
    mTask.execute(params);
    return true;
}