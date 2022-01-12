private boolean isUpdateNeeded() {
    if (!(hasBeenUpdated())) {
        return true;
    }
    return isInvalid();
}