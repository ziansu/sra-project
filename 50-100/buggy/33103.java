@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    if (!(response.isSuccessful())) {
        onFailure(call, new java.io.EOFException(response.body().string()));
        return ;
    }
    android.util.Log.i("Edit", response.body().string());
    mEditMode.finish();
}