private boolean isUpdateNeeded() {
    if (!(hasBeenUpdated())) {
        return true;
    }
    boolean isInvalid = isInvalid();
    return isInvalid;
}