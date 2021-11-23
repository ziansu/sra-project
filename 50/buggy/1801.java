public boolean hasNext() {
    assert (isRecurring) != false;
    assert (recursUntil) != null;
    return taskStartDateTime.plus(interval).isBefore(recursUntil);
}