public void send() {
    if ((this.mRecepients) == null) {
        deliver();
    }else {
        it.quip.android.task.NotificationBatchJobData jobData = new it.quip.android.task.NotificationBatchJobData(this.mRecepients, this.mSenderUid, this);
        android.os.AsyncTask task = new it.quip.android.task.NotificationBatchJob().execute(jobData);
        deliver();
    }
}