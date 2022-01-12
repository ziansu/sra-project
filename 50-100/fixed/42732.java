@java.lang.Override
public void hideBottomCard() {
    stopPulse();
    if ((currentLocationMarker) != null)
        currentLocationMarker.remove();
    
    currentLocationMarker = null;
    showCurrentLocationMarker = false;
    if ((mProgressDialog) != null) {
        mProgressDialog.cancel();
    }
    bottomButtonCard.hideBottomCardLayout();
    com.hypertrack.lib.internal.consumer.utils.AnimationUtils.collapse(liveTrackingActionLayout);
}