public boolean initSession(io.branch.referral.Branch.BranchReferralInitListener callback, @android.support.annotation.NonNull
android.net.Uri data, android.app.Activity activity) {
    readAndStripParam(data, activity);
    return initSession(callback, activity);
}