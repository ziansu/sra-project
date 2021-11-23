@java.lang.Override
protected void onRestoreInstanceState(android.os.Parcelable state) {
    android.os.Bundle bundle = ((android.os.Bundle) (state));
    android.os.Parcelable superState = bundle.getParcelable("superState");
    super.onRestoreInstanceState(superState);
    handComponent.handInitialized = bundle.getBoolean("handInitialized");
    handComponent.handPosition = bundle.getFloat("handPosition");
    handComponent.handTarget = bundle.getFloat("handTarget");
    handComponent.handVelocity = bundle.getFloat("handVelocity");
    handComponent.handAcceleration = bundle.getFloat("handAcceleration");
    handComponent.lastHandMoveTime = bundle.getLong("lastHandMoveTime");
}