@java.lang.Override
public void onExit(boolean shouldExit) {
    if (shouldExit) {
        mMogaController.exit();
        this.finish();
    }else
        if (!(mDrawerLayout.isDrawerOpen(GravityCompat.START))) {
            paulscode.android.mupen64plusae.jni.CoreInterface.resumeEmulator();
        }
    
    mWaitingOnConfirmation = false;
}