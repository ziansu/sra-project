private int getRetryInterval(int retryCount) {
    if ((BuildConfig.DEBUG) && (!(retryCount > 0))) {
        throw new java.lang.AssertionError();
    }
    final int retryCapInMilliseconds = 30000;
    final int retryBaseInMilliseconds = 500;
    return random.nextInt(java.lang.Math.min(retryCapInMilliseconds, (retryBaseInMilliseconds * ((int) (java.lang.Math.pow(2, java.lang.Math.min(retryCount, 32)))))));
}