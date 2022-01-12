@java.lang.Override
public void onResponse(retrofit2.Call<com.example.chudofom.serverlog.LoginResponse> call, retrofit2.Response<com.example.chudofom.serverlog.LoginResponse> response) {
    if ((response.body().sessionId) != null) {
        mainView.hideProgress();
        mainView.showInf(((response.body().sessionId) + ""));
        android.util.Log.d("TAG", ((response.body().sessionId) + ""));
    }
}