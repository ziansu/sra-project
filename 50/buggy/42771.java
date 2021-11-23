@android.annotation.TargetApi(value = Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public static io.branch.referral.Branch getAutoTestInstance(@android.support.annotation.NonNull
android.content.Context context) {
    io.branch.referral.Branch.isAutoSessionMode_ = true;
    io.branch.referral.Branch.customReferrableSettings_ = io.branch.referral.Branch.CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT;
    io.branch.referral.Branch.getBranchInstance(context, false);
    io.branch.referral.Branch.branchReferral_.setActivityLifeCycleObserver(((android.app.Application) (context)));
    return io.branch.referral.Branch.branchReferral_;
}