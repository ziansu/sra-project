private boolean isJobMetric(com.netflix.servo.Metric m) {
    final com.netflix.servo.tag.TagList tags = m.getConfig().getTags();
    final java.lang.String classTag = tags.getValue(JobMetrics.CLASS_TAG);
    return (classTag != null) && (classTag.equals(org.backmeup.worker.job.BackupJobRunner.class.getSimpleName()));
}