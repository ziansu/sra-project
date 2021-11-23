private void updateWhitelistSettings(int val) {
    mSiteSettings.setManualApproval((val == (-1)));
    mSiteSettings.setUseCommentWhitelist((val == 0));
    setDetailListPreferenceValue(mWhitelistPref, java.lang.String.valueOf(val), getWhitelistSummary(val));
}