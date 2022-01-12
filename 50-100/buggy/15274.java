@java.lang.Override
public void onResponse(com.squareup.okhttp.Response response) throws java.io.IOException {
    im.actor.runtime.Log.d(im.actor.runtime.se.JavaSeHttpProvider.TAG, ((("Upload part response: " + (request.toString())) + " -> ") + (response.toString())));
    if ((response.code()) == 200) {
        callback.onUploaded();
    }else {
        callback.onUploadFailure();
    }
}