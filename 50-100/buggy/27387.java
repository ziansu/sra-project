protected void showNetErrorDialog() {
    new android.app.AlertDialog.Builder(getApplicationContext()).setTitle("网络连接错误").setMessage("请重新设置网络环境").setNegativeButton("退出", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            finish();
        }
    }).setPositiveButton("设置", new android.content.DialogInterface.OnClickListener() {
        @java.lang.Override
        public void onClick(android.content.DialogInterface dialog, int which) {
            startActivity(new android.content.Intent(android.provider.Settings.ACTION_WIFI_SETTINGS));
        }
    }).show();
}