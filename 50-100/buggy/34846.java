@java.lang.Override
public void onResponse(retrofit2.Call<io.filepicker.models.FPFile> call, retrofit2.Response<io.filepicker.models.FPFile> response) {
    currentCall = null;
    if (response.isSuccessful()) {
        if (!(cancelled))
            de.greenrobot.event.EventBus.getDefault().post(new io.filepicker.events.FileExportedEvent(path, response.body()));
        
        android.util.Log.d(io.filepicker.services.ContentService.LOG_TAG, "success");
    }else {
        android.util.Log.d(io.filepicker.services.ContentService.LOG_TAG, "failure");
    }
    countDownLatch.countDown();
}