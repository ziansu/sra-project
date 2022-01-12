@java.lang.Override
public void onFailure(okhttp3.Call call, java.io.IOException e) {
    e.printStackTrace();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(com.example.shinianer.goodweather.MainActivity.this, "从接口获取天气信息失败，请重试。", Toast.LENGTH_LONG).show();
            swipeRefresh.setRefreshing(false);
        }
    });
}