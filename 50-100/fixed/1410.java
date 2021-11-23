@java.lang.Override
public void onResponse(retrofit2.Call<io.filepicker.models.UploadLocalFileResponse> call, retrofit2.Response<io.filepicker.models.UploadLocalFileResponse> response) {
    currentCall = null;
    if (response.isSuccessful()) {
        onFileUploadSuccess(response.body(), uri);
    }else {
        handleUploadFileError(uri, getErrorType(response));
    }
}