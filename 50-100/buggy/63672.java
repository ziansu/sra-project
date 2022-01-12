@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    if (((badge) != null) && (state instanceof android.os.Bundle)) {
        android.os.Bundle bundle = ((android.os.Bundle) (state));
        badge.restoreState(bundle, indexInContainer);
        state = bundle.getParcelable("superstate");
    }
    super.onRestoreInstanceState(state);
}