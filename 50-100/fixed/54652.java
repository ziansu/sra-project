@java.lang.Override
protected android.os.Parcelable onSaveInstanceState() {
    android.os.Parcelable superState = super.onSaveInstanceState();
    android.os.Bundle state = new android.os.Bundle();
    state.putParcelable("superState", superState);
    state.putFloat("handPosition", handComponent.handPosition);
    state.putFloat("handTarget", handComponent.handTarget);
    state.putFloat("handVelocity", handComponent.handVelocity);
    state.putFloat("handAcceleration", handComponent.handAcceleration);
    state.putLong("lastHandMoveTime", handComponent.lastHandMoveTime);
    return state;
}