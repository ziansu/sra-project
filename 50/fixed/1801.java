public boolean hasNext() {
    if (isRecurring) {
        if ((recursUntil) != null) {
            return taskStartDateTime.plus(interval).isBefore(recursUntil);
        }
        return true;
    }
    return false;
}