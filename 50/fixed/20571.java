@java.lang.Override
public void onFailure(com.squareup.okhttp.Request request, java.io.IOException e) {
    im.actor.runtime.Log.d(im.actor.runtime.se.JavaSeHttpProvider.TAG, ("Downloading part error: " + (request.toString())));
    e.printStackTrace();
    callback.onDownloadFailure(0, 0);
}