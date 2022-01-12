@java.lang.Override
public void onResponse(retrofit2.Call<java.lang.String> call, retrofit2.Response<java.lang.String> response) {
    if (response.isSuccessful()) {
        android.widget.Toast.makeText(getBaseContext(), "로그아웃 성공", Toast.LENGTH_LONG).show();
        finish();
    }else {
        android.widget.Toast.makeText(getBaseContext(), "로그아웃 실패", Toast.LENGTH_LONG).show();
    }
}