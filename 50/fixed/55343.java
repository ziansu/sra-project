@java.lang.Override
public void turnFrontScreenFlashOn() {
    if (MyDebug.LOG)
        android.util.Log.d(vn.mbm.phimp.me.opencamera.MyApplicationInterface.TAG, "turnFrontScreenFlashOn");
    
    used_front_screen_flash = true;
    drawPreview.turnFrontScreenFlashOn();
}