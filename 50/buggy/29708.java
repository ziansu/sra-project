public static int init(android.app.Activity activity) {
    org.qtproject.qt5.crypt.Crypter.mActivity = activity;
    org.qtproject.qt5.crypt.Crypter.provider = new org.qtproject.qt5.crypt.ZofenProvider(activity);
    if (!(org.qtproject.qt5.crypt.Crypter.isKukaytaInstalled())) {
        org.qtproject.qt5.crypt.Crypter.installKukatya();
        return org.qtproject.qt5.crypt.Crypter.KUKAYTA_NOT_INSTALLED_ERR;
    }
    return 0;
}