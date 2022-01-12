public boolean initSession(io.branch.referral.Branch.BranchUniversalReferralInitListener callback, boolean isReferrable, android.app.Activity activity) {
    initUserSessionInternal(callback, activity, isReferrable);
    return true;
}