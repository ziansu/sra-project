public static boolean shouldJobRun(com.huffingtonpost.chronos.model.JobSpec aJob, org.joda.time.DateTime now) {
    if (((aJob.isEnabled()) == false) || ((aJob.getCronString()) == null)) {
        return false;
    }
    com.huffingtonpost.chronos.util.CronExpression ce = com.huffingtonpost.chronos.util.CronExpression.createWithoutSeconds(aJob.getCronString());
    org.joda.time.DateTime next = ce.nextTimeAfter(now.minusMinutes(1));
    return next.equals(now);
}