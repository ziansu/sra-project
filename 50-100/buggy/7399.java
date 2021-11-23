private void startVPN(de.blinkt.openvpn.VpnProfile profile) {
    mSelectedProfile = profile;
    mSelectedProfile.mAllowLocalLAN = mLanCheck.isChecked();
    profileManager.saveProfile(this, profile);
    prefs.setLastProfile(profile.getName());
    prefs.setLastUuid(profile.getUUIDString());
    prefs.setLan(mSelectedProfile.mAllowLocalLAN);
    launchVPN();
}