@java.lang.Override
public void onConfirmed(boolean isFirstTime, byte[] password) {
    if (isFirstTime) {
        startMain();
    }else {
        java.lang.String pwd = new java.lang.String(password);
        mApp.setPassword(pwd, false);
        new com.z299studio.pb.DecryptTask(mApp.getData(), mApp.getAppHeaderData(), this).execute(pwd);
    }
}