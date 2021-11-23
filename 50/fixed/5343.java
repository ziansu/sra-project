@java.lang.Override
public void onFailure(retrofit2.Call<io.filepicker.models.Folder> call, java.lang.Throwable throwable) {
    currentCall = null;
    if (!(cancelled))
        handleApiError(ApiErrorEvent.ErrorType.UNKNOWN_ERROR);
    
}