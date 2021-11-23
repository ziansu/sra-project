@java.lang.Override
protected void onDialogClosed(boolean positiveResult) {
    if (((mListener) != null) && positiveResult)
        mListener.onPreferenceChange(this, getCurrentProgress());
    
    if (positiveResult)
        getSharedPreferences().edit().putInt(getKey(), getCurrentProgress()).apply();
    
    super.onDialogClosed(positiveResult);
}