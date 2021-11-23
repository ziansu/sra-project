public static oracle.ateam.sample.mobile.util.MCSManager getInstance() {
    if ((oracle.ateam.sample.mobile.util.MCSManager.instance) == null) {
        oracle.ateam.sample.mobile.util.MCSManager.instance = new oracle.ateam.sample.mobile.util.MCSManager();
        oracle.adfmf.framework.api.AdfmfJavaUtilities.setELValue("#{applicationScope.ampa_mcs_manager}", oracle.ateam.sample.mobile.util.MCSManager.instance);
    }
    return oracle.ateam.sample.mobile.util.MCSManager.instance;
}