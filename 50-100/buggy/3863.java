@java.lang.Override
public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession session, android.hardware.camera2.CaptureRequest request, android.hardware.camera2.TotalCaptureResult result) {
    super.onCaptureCompleted(session, request, result);
    android.widget.Toast.makeText(this, ("Saved:" + file), Toast.LENGTH_SHORT).show();
    android.content.Intent i = new android.content.Intent(this, bluemix.ruazosa.fer.hr.bluemix.ClassifyActivity.class);
    i.putExtra("file", file.getPath());
    startActivity(i);
    createCameraPreview();
}