@java.lang.Override
public void run() {
    if (!(isFinishing())) {
        if (org.onepf.opfiab.BuildConfig.DEBUG) {
            throw new java.lang.IllegalStateException();
        }
        org.onepf.opfutils.OPFLog.e("OPFIabActivity wasn't utilised! Finishing: %s", this);
        finish();
    }
}