public boolean initSessionWithData(android.net.Uri data, android.app.Activity activity) {
    boolean uriHandled = readAndStripParam(data, activity);
    initSession(((io.branch.referral.Branch.BranchReferralInitListener) (null)), activity);
    return uriHandled;
}