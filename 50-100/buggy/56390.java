public boolean initSession(io.branch.referral.Branch.BranchReferralInitListener callback, android.app.Activity activity) {
    if ((io.branch.referral.Branch.customReferrableSettings_) == (io.branch.referral.Branch.CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT)) {
        initUserSessionInternal(callback, activity, true);
    }else {
        boolean isReferrable = (io.branch.referral.Branch.customReferrableSettings_) == (io.branch.referral.Branch.CUSTOM_REFERRABLE_SETTINGS.REFERRABLE);
        initUserSessionInternal(callback, activity, isReferrable);
    }
    return false;
}