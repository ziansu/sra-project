@java.lang.Override
public void run() {
    if (!(isFinishing())) {
        org.onepf.opfutils.OPFLog.e("OPFIabActivity wasn't utilised! Finishing: %s", this);
        finish();
    }
}