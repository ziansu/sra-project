@java.lang.Override
public void onResponse(retrofit2.Call<java.lang.Boolean> call, retrofit2.Response<java.lang.Boolean> response) {
    if (!(response.isSuccessful())) {
        int statusCode = response.code();
        android.util.Log.e("MainActivity", ("Response not successful. Status code: " + statusCode));
        return ;
    }
}