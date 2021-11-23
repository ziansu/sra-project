@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    if (state instanceof android.os.Bundle) {
        android.os.Bundle bundle = ((android.os.Bundle) (state));
        restoreState(bundle);
        state = bundle.getParcelable("superstate");
    }
    super.onRestoreInstanceState(state);
}