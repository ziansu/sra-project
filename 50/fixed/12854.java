@java.lang.Override
public boolean isScheduledConstraintViolated(symposium.model.VenueTime venueTime) {
    for (java.lang.String panelist : PANEL.PANELISTS) {
        if ((calculateAppearancesPerDay(panelist)) < (determineMinimum(panelist))) {
            return true;
        }
    }
    return false;
}