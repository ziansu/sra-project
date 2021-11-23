@java.lang.Override
public void onFailure(retrofit2.Call<io.filepicker.models.UploadLocalFileResponse> call, java.lang.Throwable throwable) {
    currentCall = null;
    handleUploadFileError(uri, ApiErrorEvent.ErrorType.UNKNOWN_ERROR);
    countDownLatch.countDown();
}