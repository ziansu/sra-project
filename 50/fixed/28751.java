public boolean hasBeenDelivered(java.util.Calendar currentDate) {
    if ((trams.main.MyCalendarUtils.getDiff(currentDate, deliveryDate)) >= 0) {
        return true;
    }
    return false;
}