protected void checkBeginTripButton() {
    if (!(canBeginTrip)) {
        beginTripButton.setEnabled(false);
    }else {
        beginTripButton.setEnabled(true);
    }
}