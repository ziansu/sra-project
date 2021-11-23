@java.lang.Override
public void onFailure(retrofit2.Call<com.emolance.enterprise.data.TestReport> call, java.lang.Throwable t) {
    android.util.Log.e(com.emolance.enterprise.ui.QRScanActivity.TAG, "Failed to submit the test report.", t);
    android.widget.Toast.makeText(this, "Failed to process test report.", Toast.LENGTH_SHORT).show();
    if (isFlashOn) {
        turnOffFlash();
    }
    this.finish();
}