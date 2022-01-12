@java.lang.Override
public boolean toggle() {
    try {
        cameraManager.setTorchMode(cameraId, (!(isOn)));
        isOn = !(isOn);
        if (!(isOn))
            co.ericp.flashlight.FlashlightProvider.clear();
        
        return isOn;
    } catch (android.hardware.camera2.CameraAccessException e) {
        android.widget.Toast.makeText(app, R.string.not_available, Toast.LENGTH_LONG).show();
        return false;
    }
}