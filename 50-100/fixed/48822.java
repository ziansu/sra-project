@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    try {
        this.holder = holder;
        if ((isSupport()) && (holder != null)) {
            holder.setFixedSize(0, 0);
            camera.setPreviewDisplay(holder);
            android.util.Log.d(mfv.home.flashlight.FlashLight.FLASH_TAG, "surface created");
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}