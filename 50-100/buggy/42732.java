@java.lang.Override
public void hideBottomCard() {
    if ((currentLocationMarker) != null)
        currentLocationMarker.remove();
    
    currentLocationMarker = null;
    showCurrentLocationMarker = false;
    stopPulse();
    if ((mProgressDialog) != null) {
        mProgressDialog.cancel();
    }
    bottomButtonCard.hideBottomCardLayout();
    com.hypertrack.lib.internal.consumer.utils.AnimationUtils.collapse(liveTrackingActionLayout);
}