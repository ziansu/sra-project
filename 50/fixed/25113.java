@java.lang.Override
public void onFailure(java.io.IOException e, com.squareup.okhttp.Response response) {
    if ((pingTask) != null)
        pingTask.cancel();
    
    failListener.onFailed(e);
}