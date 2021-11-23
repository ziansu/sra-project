public static int calculateRemainingDaysOfLicense(long initialTimeInMillis, long currentTimeInMillis) {
    long remainingTimeInMillis = currentTimeInMillis - initialTimeInMillis;
    int daysPastSinceTrialStarted = ((int) (remainingTimeInMillis / (((1000 * 60) * 60) * 24)));
    return 1 - daysPastSinceTrialStarted;
}