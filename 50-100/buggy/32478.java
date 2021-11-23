@java.lang.Override
public void onExit(boolean shouldExit) {
    if (shouldExit) {
        final java.lang.String saveFileName = mAutoSaveManager.getAutoSaveFileName();
        paulscode.android.mupen64plusae.jni.CoreInterface.pauseEmulator(true, saveFileName);
        mAutoSaveManager.clearOldest();
        paulscode.android.mupen64plusae.jni.CoreInterface.shutdownEmulator();
        mMogaController.exit();
        this.finish();
    }else
        if (!(mDrawerLayout.isDrawerOpen(GravityCompat.START))) {
            paulscode.android.mupen64plusae.jni.CoreInterface.resumeEmulator();
        }
    
    mWaitingOnConfirmation = false;
}