private void startReboot() {
    android.util.Log.v(com.general.mediaplayer.csr.services.CsrManagerService.TAG, "==CsrManagerService==startReboot==");
    if (!(this.mRebootIsDo)) {
        android.util.Log.v(com.general.mediaplayer.csr.services.CsrManagerService.TAG, "==CsrManagerService==startReboot==do=========");
        this.mRebootIsDo = true;
    }
}