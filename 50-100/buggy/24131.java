private boolean updateLastRegistrationTime() {
    long currentTime = java.lang.System.currentTimeMillis();
    if (isTimeWindowEmpty(currentTime)) {
        if (registrationWeakLock.compareAndSet(false, true)) {
            if (isTimeWindowEmpty(currentTime)) {
                lastRegistrationTime = currentTime;
                registrationWeakLock.set(false);
                return true;
            }
        }
    }
    return false;
}