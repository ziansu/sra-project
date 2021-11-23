private boolean updateLastRegistrationTime() {
    long currentTime = java.lang.System.currentTimeMillis();
    boolean result = false;
    if (isTimeWindowEmpty(currentTime)) {
        if (registrationWeakLock.compareAndSet(false, true)) {
            if (isTimeWindowEmpty(currentTime)) {
                lastRegistrationTime = currentTime;
                result = true;
            }
            registrationWeakLock.set(false);
        }
    }
    return result;
}