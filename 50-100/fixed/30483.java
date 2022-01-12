public boolean needsWarning() {
    if ((warningTimes.size()) > 0) {
        if ((expiresInHours()) <= (warningTimes.get(0))) {
            warningTimes.remove(0);
            return true;
        }
    }
    return false;
}