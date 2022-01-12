public boolean needsWarning() {
    for (int i = 0; i < (warningTimes.length); ++i) {
        if ((expiresInHours()) <= (warningTimes[i])) {
            warningTimes[i] = 0;
            return true;
        }
    }
    return false;
}