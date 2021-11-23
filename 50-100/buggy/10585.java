public void showErroDialog() {
    android.app.AlertDialog.Builder alert = new android.app.AlertDialog.Builder(this);
    alert.setMessage("哎呀，居然发生错误了，是不是没有安装这个程序呢 :(");
    alert.setPositiveButton("确定", null);
    alert.setCancelable(false);
    alert.create();
    alert.show();
}