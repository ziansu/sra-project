private void findCourier() throws java.lang.NullPointerException {
    java.lang.String tracking_number = mItemWeakReference.get().getTrackingNumber().toUpperCase(java.util.Locale.US);
    java.util.ArrayList<com.andrespenaloza.intellitracker.objects.Courier.Courier> couriers = com.andrespenaloza.intellitracker.objects.Courier.Courier.getCouriersMatchingTracking(tracking_number);
    for (int c : mItemWeakReference.get().getCourierIds()) {
        if (connectCourier(c)) {
            mItemWeakReference.get().setCourierId(c);
            return ;
        }
    }
    downloadFailed(TrackingItem.STATUS_ERROR_TRACKING_NUMBER);
}