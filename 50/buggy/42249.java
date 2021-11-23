@java.lang.Override
public void onStop() {
    getStoreFactory().getInAppNotificationStore().setUserSendingPicture(false);
    sensorManager.unregisterListener(shakeEventListener);
    getControllerFactory().getOrientationController().removeOrientationControllerObserver(this);
    super.onStop();
}