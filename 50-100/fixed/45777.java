@java.lang.Override
protected void onDialogClosed(boolean positiveResult) {
    java.lang.CharSequence[] values = getEntryValues();
    if ((values != null) && ((mSelectedIndex) < (values.length))) {
        java.lang.String value = values[(positiveResult ? mSelectedIndex : mStartingIndex)].toString();
        callChangeListener(value);
    }
}