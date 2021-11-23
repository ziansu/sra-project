private void setAndRemove() {
    if (!(jobList.isEmpty())) {
        currentJob = jobList.get(0);
        jobName.setText(currentJob.getName());
        jobList.remove(0);
    }else {
        currentJob = null;
        jobName.setText(com.example.phil.httppost.JobFeed.NO_JOBS_MSG);
    }
}