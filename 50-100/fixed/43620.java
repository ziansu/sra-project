@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    if (MyDebug.LOG)
        android.util.Log.d(vn.mbm.phimp.me.opencamera.Camera.CameraActivity.TAG, ("onWindowFocusChanged: " + hasFocus));
    
    super.onWindowFocusChanged(hasFocus);
    if ((!(this.camera_in_background)) && hasFocus) {
        initImmersiveMode();
    }
}