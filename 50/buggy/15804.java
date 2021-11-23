@java.lang.Override
public void register() {
    org.onepf.opfutils.OPFLog.methodD();
    if (!(isRegistered())) {
        org.onepf.opfutils.OPFLog.d("Start register ADMProvider.");
        adm.startRegister();
    }
}