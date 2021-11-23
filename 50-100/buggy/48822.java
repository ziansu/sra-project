@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    try {
        if ((isSupport()) && (holder != null)) {
            android.util.Log.d(mfv.home.flashlight.FlashLight.FLASH_TAG, "surface created");
            holder.setFixedSize(0, 0);
            camera.setPreviewDisplay(holder);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}