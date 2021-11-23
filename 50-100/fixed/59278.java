@java.lang.Override
protected void onRestoreInstanceState(android.os.Parcelable state) {
    final com.andrognito.patternlockview.PatternLockView.SavedState savedState = ((com.andrognito.patternlockview.PatternLockView.SavedState) (state));
    super.onRestoreInstanceState(savedState.getSuperState());
    setPattern(com.andrognito.patternlockview.PatternLockView.PatternViewMode.CORRECT, com.andrognito.patternlockview.utils.PatternLockUtils.stringToPattern(this, savedState.getSerializedPattern()));
    mPatternViewMode = savedState.getDisplayMode();
    mInputEnabled = savedState.isInputEnabled();
    mInStealthMode = savedState.isInStealthMode();
    mEnableHapticFeedback = savedState.isTactileFeedbackEnabled();
}