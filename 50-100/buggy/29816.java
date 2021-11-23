public void processTimedNotification() {
    bikescheme.Hub.logger.fine("");
    for (bikescheme.User u : users) {
        int charge = 0;
        for (bikescheme.Trip tr : u.getTrips()) {
            charge += tr.getPrice();
        }
        applyCharges(charge, u.getPersonalDetails(), u.getCardDetails());
        u.clearTrips();
    }
    bikescheme.Hub.logger.fine("CLEARING COMPLETE");
}