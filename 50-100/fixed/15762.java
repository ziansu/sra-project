public void fillInfo() {
    if ((mDiningHall.getVenue()) != null) {
        java.util.List<com.pennapps.labs.pennmobile.classes.VenueInterval> days = mDiningHall.getVenue().allHours();
        java.util.LinkedList<android.widget.TextView> vertical = new java.util.LinkedList<>();
        for (com.pennapps.labs.pennmobile.classes.VenueInterval day : days) {
            vertical = addDiningHour(day, vertical);
        }
    }
}