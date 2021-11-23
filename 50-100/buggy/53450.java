@java.lang.Override
protected void onDialogClosed(boolean positiveResult) {
    super.onDialogClosed(positiveResult);
    if (((mListener) != null) && positiveResult)
        mListener.onPreferenceChange(this, getCurrentProgress());
    
    if (positiveResult)
        getSharedPreferences().edit().putInt(getKey(), getCurrentProgress()).apply();
    
}