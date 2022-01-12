private long subtract(final long seconds) {
    if (seconds < 0)
        return 0;
    
    long dayChanges = -(seconds / (Constants.SECONDS_IN_DAY));
    int remainingSeconds = ((int) (seconds % (Constants.SECONDS_IN_DAY)));
    int complementarySeconds = (Constants.SECONDS_IN_DAY) - remainingSeconds;
    dayChanges = dayChanges - 1;
    dayChanges = dayChanges + (this.add(complementarySeconds));
    return dayChanges;
}