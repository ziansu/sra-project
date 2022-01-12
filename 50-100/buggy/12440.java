@android.annotation.TargetApi(value = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public static io.branch.referral.Branch getAutoInstance(@android.support.annotation.NonNull
android.content.Context context, boolean isReferrable) {
    io.branch.referral.Branch.isAutoSessionMode_ = true;
    io.branch.referral.Branch.customReferrableSettings_ = (isReferrable) ? io.branch.referral.Branch.CUSTOM_REFERRABLE_SETTINGS.REFERRABLE : io.branch.referral.Branch.CUSTOM_REFERRABLE_SETTINGS.NON_REFERRABLE;
    boolean isDebug = io.branch.referral.BranchUtil.isTestModeEnabled(context);
    io.branch.referral.Branch.getBranchInstance(context, (!isDebug));
    io.branch.referral.Branch.branchReferral_.setActivityLifeCycleObserver(((android.app.Application) (context)));
    return io.branch.referral.Branch.branchReferral_;
}