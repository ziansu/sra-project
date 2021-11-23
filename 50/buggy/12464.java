private boolean checkForSelectedEvent() {
    if (completeState.hasSingleEventSelected()) {
        originalEvent = completeState.getSingleSelectedEvent();
    }
    return true;
}