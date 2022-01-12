public static void openIntroIfNeeded(android.app.Activity mActivity) {
    com.felkertech.settingsmanager.SettingsManager sm = new com.felkertech.settingsmanager.SettingsManager(mActivity);
    if ((sm.getInt(R.string.sm_last_version)) < (com.felkertech.n.ActivityUtils.LAST_GOOD_BUILD)) {
        mActivity.startActivity(new android.content.Intent(mActivity, com.felkertech.n.cumulustv.Intro.Intro.class));
        mActivity.finish();
    }
}