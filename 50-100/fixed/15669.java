private void createAlarmJob(io.mdevlab.unconnectify.alarm.PreciseConnectivityAlarm alarm, boolean activate) {
    if ((alarm.getJobId()) != (-1))
        com.evernote.android.job.JobManager.instance().cancel(alarm.getJobId());
    
    io.mdevlab.unconnectify.jobs.ConnectivityJobManager.buildJobRequest(alarm, io.mdevlab.unconnectify.utils.AlarmUtils.getStringFromConnection(alarm.getFirstConnection()), activate, alarm.getExecuteTimeInMils());
}