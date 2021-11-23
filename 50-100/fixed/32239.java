@java.lang.Override
public void toggle() {
    try {
        cameraManager.setTorchMode(cameraId, (!(isOn)));
        isOn = !(isOn);
        if (!(isOn))
            co.ericp.flashlight.FlashlightProvider.clear();
        
    } catch (android.hardware.camera2.CameraAccessException e) {
        android.widget.Toast.makeText(app, R.string.not_available, Toast.LENGTH_LONG).show();
    }
}