@android.support.annotation.NonNull
public com.kii.thingif.trigger.TriggeredCommandForm.Builder setTargetID(@android.support.annotation.Nullable
com.kii.thingif.TypedID targetID) throws java.lang.IllegalArgumentException {
    if ((targetID != null) && ((targetID.getType()) == (TypedID.Types.THING))) {
        throw new java.lang.IllegalArgumentException("targetID type must be Types.THING");
    }
    this.targetID = targetID;
    return this;
}