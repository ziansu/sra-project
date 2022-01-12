@java.lang.Override
protected void onDialogClosed(boolean positiveResult) {
    java.lang.CharSequence[] values = getEntryValues();
    if (((values != null) && ((mSelectedIndex) < (values.length))) && ((mSelectedIndex) != (mStartingIndex))) {
        java.lang.String value = values[(positiveResult ? mSelectedIndex : mStartingIndex)].toString();
        setValue(value);
        callChangeListener(value);
    }
}