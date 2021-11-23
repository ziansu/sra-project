private void showVRToxinLogo() {
    mVRToxinLogo = Settings.System.getIntForUser(getContext().getContentResolver(), Settings.System.STATUS_BAR_VRTOXIN_LOGO_SHOW, 0, UserHandle.USER_CURRENT);
}