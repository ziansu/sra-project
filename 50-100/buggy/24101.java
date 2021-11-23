@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mSiteSettings.getPagingCount()) != (mNumberPicker.getValue())) {
        if (mSwitchChecked) {
            onPreferenceChange(mPagingPref, mNumberPicker.getValue());
        }else {
            onPreferenceChange(mPagingPref, 0);
        }
    }
}