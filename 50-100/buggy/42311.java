private void updateWhitelistSettings(int val) {
    switch (val) {
        case -1 :
            mSiteSettings.setManualApproval(true);
            mSiteSettings.setUseCommentWhitelist(false);
            break;
        case 0 :
            mSiteSettings.setManualApproval(true);
            mSiteSettings.setUseCommentWhitelist(true);
            break;
        case 1 :
            mSiteSettings.setManualApproval(false);
            mSiteSettings.setUseCommentWhitelist(false);
            break;
    }
    setDetailListPreferenceValue(mWhitelistPref, java.lang.String.valueOf(val), getWhitelistSummary(val));
}