@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (!(mShowList[which].equals(mContext.getString(R.string.string_Custom)))) {
        com.asgj.android.appusage.Utility.UsageSharedPrefernceHelper.setShowByUsage(getBaseContext(), mShowList[which]);
        displayDataForApps();
        displayDataForMusic();
    }else {
        startDateFragment = new com.asgj.android.appusage.dialogs.MonthViewFragment();
        startDateFragment.show(getFragmentManager(), "startMonthViewPicker");
    }
    dialog.dismiss();
}