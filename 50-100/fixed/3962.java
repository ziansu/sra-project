public void forceLogout(java.lang.String token) {
    valet.intan.com.valetparking.util.PrefManager prefManager = valet.intan.com.valetparking.util.PrefManager.getInstance(this);
    prefManager.logoutUser();
    prefManager.setLoggingOut(false);
    prefManager.setPrinterMacAddress(null);
    stopAllService();
    goToSplash();
    stopSelf();
}