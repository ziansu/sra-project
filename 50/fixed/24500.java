@java.lang.Override
public void onCreate() {
    super.onCreate();
    io.branch.referral.Branch.enableLogging();
    io.branch.referral.Branch.enableMatchGuaranteed();
    io.branch.referral.Branch.getAutoInstance(this);
}