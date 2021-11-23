@java.lang.Override
public void onResponse(com.squareup.okhttp.Response response) throws java.io.IOException {
    try {
        java.lang.String jsonData = response.body().string();
        if (response.isSuccessful()) {
            callback.onResponse(response);
        }
    } catch (java.io.IOException e) {
        android.util.Log.d(("DWPresent" + " IOEXCEPTION"), e.getMessage());
    }
}