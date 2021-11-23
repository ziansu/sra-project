private void setAndRemove() {
    if (!(jobList.isEmpty())) {
        currentJob = jobList.get(0);
        java.lang.String[] jobView = currentJob.split("&");
        jobName.setText((((jobView[0]) + " ~ ") + (jobView[1])));
        jobList.remove(0);
    }else {
        currentJob = com.example.phil.httppost.JobFeed.NO_JOBS_MSG;
        jobName.setText(com.example.phil.httppost.JobFeed.NO_JOBS_MSG);
    }
}