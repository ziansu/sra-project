@java.lang.Override
public void done(boolean isSuccess) {
    if (isSuccess) {
        com.example.scandemo5.Utils.Global.isSuccessUpdataHttpdata = true;
        loadingview.stopOk();
    }else {
        com.example.scandemo5.Utils.Global.isSuccessUpdataHttpdata = false;
        android.widget.Toast.makeText(com.example.scandemo5.MyApp.getContext(), "供货商数据更新失败", Toast.LENGTH_SHORT).show();
        loadingview.stopFailure();
    }
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            startActivity(new android.content.Intent(com.example.scandemo5.Activity.WelcomeActivity.this, com.example.scandemo5.Activity.MainActivity.class));
            finish();
        }
    }).start();
}