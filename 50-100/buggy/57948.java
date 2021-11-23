@java.lang.Override
public void onResponse(com.squareup.okhttp.Response response) throws java.io.IOException {
    im.actor.runtime.Log.d(im.actor.runtime.se.JavaSeHttpProvider.TAG, ((("Downloading part response: " + (request.toString())) + " -> ") + (response.toString())));
    if ((response.code()) == 206) {
        callback.onDownloaded(response.body().bytes());
    }else {
        callback.onDownloadFailure();
    }
}