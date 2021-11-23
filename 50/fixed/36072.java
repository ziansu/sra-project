@java.lang.Override
public void onCaptureCompleted(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session, @android.support.annotation.NonNull
android.hardware.camera2.CaptureRequest request, @android.support.annotation.NonNull
android.hardware.camera2.TotalCaptureResult result) {
    showToast(("Saved: " + (mFile)));
    android.util.Log.d(com.example.android.camera2basic.Camera2BasicFragment.TAG, ("Saved: " + (mFile.toString())));
    unlockFocus();
}