public void incrementFailedLoginCount() {
    if ((failedLoginCount) == null) {
        failedLoginCount = 0L;
    }
    (failedLoginCount)++;
}