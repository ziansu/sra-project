public boolean initSessionWithData(android.net.Uri data, android.app.Activity activity) {
    readAndStripParam(data, activity);
    return initSession(((io.branch.referral.Branch.BranchReferralInitListener) (null)), activity);
}