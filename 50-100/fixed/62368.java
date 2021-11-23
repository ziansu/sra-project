private void connect() throws java.lang.NullPointerException {
    if ((mItemWeakReference.get().getCourierIds().size()) > 1) {
        handleState(TrackingManager.SEARCHING_COURIER);
        findCourier();
    }else
        if ((mItemWeakReference.get().getCourierIds().size()) == 1) {
            connectCourier(mItemWeakReference.get().getCourierIds().get(0), true);
        }
    
}