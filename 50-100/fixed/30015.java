@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    if (state instanceof com.dd.CircularProgressButton.SavedState) {
        com.dd.CircularProgressButton.SavedState savedState = ((com.dd.CircularProgressButton.SavedState) (state));
        mProgress = savedState.mProgress;
        mIndeterminateProgressMode = savedState.mIndeterminateProgressMode;
        mConfigurationChanged = savedState.mConfigurationChanged;
        super.onRestoreInstanceState(savedState.getSuperState());
    }else {
        super.onRestoreInstanceState(state);
    }
}