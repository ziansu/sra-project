public static oracle.ateam.sample.mobile.util.MCSManager getInstance() {
    if ((oracle.ateam.sample.mobile.util.MCSManager.instance) == null) {
        oracle.ateam.sample.mobile.util.MCSManager.instance = new oracle.ateam.sample.mobile.util.MCSManager();
    }
    return oracle.ateam.sample.mobile.util.MCSManager.instance;
}