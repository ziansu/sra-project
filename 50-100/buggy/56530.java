protected void onRequestError(int errorCode, byte[] errorResponse, java.lang.Throwable throwable) {
    if (errorCode == (-2)) {
        android.util.Log.e("exception", "network exception");
        android.widget.Toast toast = android.widget.Toast.makeText(this, "网络异常", Toast.LENGTH_SHORT);
        toast.show();
    }
    if (errorCode == (-1)) {
        android.util.Log.e("exception", "data_parse_exception");
        android.widget.Toast toast = android.widget.Toast.makeText(this, "数据解析错误", Toast.LENGTH_SHORT);
        toast.show();
    }
}