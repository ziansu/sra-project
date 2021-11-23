public boolean initSession(io.branch.referral.Branch.BranchReferralInitListener callback, @android.support.annotation.NonNull
android.net.Uri data, android.app.Activity activity) {
    boolean uriHandled = readAndStripParam(data, activity);
    initSession(callback, activity);
    return uriHandled;
}