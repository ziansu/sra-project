@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    if (response.isSuccessful()) {
        java.lang.String responseStr = response.body().string();
        android.util.Log.d("RESPONSE WHOAMI", responseStr);
        loadData();
    }else {
        android.util.Log.d("RESPONSE WHOAMI", "ertyui2");
        refreshToken();
    }
}