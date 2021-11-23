@java.lang.Override
public void onFailure(retrofit2.Call<io.filepicker.models.FPFile> call, java.lang.Throwable throwable) {
    android.util.Log.e(io.filepicker.services.ContentService.LOG_TAG, "failure", throwable);
    countDownLatch.countDown();
}