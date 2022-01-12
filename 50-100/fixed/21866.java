@java.lang.Override
public void onResponse(okhttp3.Call call, final okhttp3.Response response) throws java.io.IOException {
    if (!(response.isSuccessful())) {
        onFailure(call, new java.io.IOException(response.body().string()));
        return ;
    }
    mActivity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mProgressDialog.hide();
            mLoginButton.performClick();
            android.util.Log.i("Registration", response.toString());
        }
    });
}