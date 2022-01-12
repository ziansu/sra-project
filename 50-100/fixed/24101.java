@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mSwitchChecked) && ((mSiteSettings.getPagingCount()) != (mNumberPicker.getValue()))) {
        onPreferenceChange(mPagingPref, mNumberPicker.getValue());
    }else {
        onPreferenceChange(mPagingPref, 0);
    }
}