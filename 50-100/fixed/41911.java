static boolean isUnderRecording() {
    if (com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.hasActionBar) {
        return (com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.getButtonOnScreen(com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.activityMytracks.getString(R.string.menu_record_track), false, false)) == null;
    }
    com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.showMoreMenuItem(0);
    if ((com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.SOLO.searchText(com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.activityMytracks.getString(R.string.menu_record_track))) || (com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.SOLO.searchText(com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.activityMytracks.getString(R.string.menu_play)))) {
        com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.SOLO.goBack();
        return false;
    }
    com.google.android.apps.mytracks.endtoendtest.EndToEndTestUtils.SOLO.goBack();
    return true;
}