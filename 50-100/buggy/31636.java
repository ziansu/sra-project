@java.lang.Override
public void onHeadRotated(final org.deviceconnect.android.deviceplugin.theta.utils.Quaternion rotation) {
    synchronized(this) {
        if (isRunning()) {
            org.deviceconnect.android.deviceplugin.theta.core.SphericalViewRenderer.Camera currentCamera = mRenderer.getCamera();
            org.deviceconnect.android.deviceplugin.theta.core.SphericalViewRenderer.CameraBuilder newCamera = new org.deviceconnect.android.deviceplugin.theta.core.SphericalViewRenderer.CameraBuilder(currentCamera);
            newCamera.rotate(rotation);
            mRenderer.setCamera(newCamera.create());
        }
    }
}