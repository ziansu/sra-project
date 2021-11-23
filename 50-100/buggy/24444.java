@java.lang.Override
public void onResponse(retrofit2.Call<io.filepicker.models.Folder> call, retrofit2.Response<io.filepicker.models.Folder> response) {
    currentCall = null;
    if (response.isSuccessful()) {
        if (!(cancelled))
            de.greenrobot.event.EventBus.getDefault().post(new io.filepicker.events.GotContentEvent(response.body(), backPressed));
        
    }else {
        if (!(cancelled))
            handleApiError(getErrorType(response));
        
    }
    countDownLatch.countDown();
}