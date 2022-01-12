@java.lang.Override
protected android.os.Parcelable onSaveInstanceState() {
    com.miruker.fabprogress.Fab.SavedState saved = new com.miruker.fabprogress.Fab.SavedState(super.onSaveInstanceState());
    saved.mBackgroundCanvasColor = mBackgroundCanvasColor;
    saved.mBackgroundCanvasSize = mBackgroundCanvasSize;
    saved.mProgressColor = mProgressColor;
    saved.mProgressValue = mProgressValue;
    saved.mReverse = mReverse;
    saved.isProgress = isProgress;
    saved.mProgressAccelerate = mProgressAccelerate;
    saved.mProgressSweepValue = mProgressSweepValue;
    saved.mProgressState = mSuccessAnimationState.key;
    saved.mFinishDelay = mFinishDelay;
    return saved;
}