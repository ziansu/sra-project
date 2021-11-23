@java.lang.Override
public void onCaptureCompleted(@android.support.annotation.NonNull
android.hardware.camera2.CameraCaptureSession session, @android.support.annotation.NonNull
android.hardware.camera2.CaptureRequest request, @android.support.annotation.NonNull
android.hardware.camera2.TotalCaptureResult result) {
    showToast(("Saved: " + (mFile)));
    java.lang.System.out.println(("Saved " + (mFile)));
    android.util.Log.d(com.threedoorstudio.ingredients.ingredient_app.Camera2BasicFragment.TAG, mFile.toString());
}