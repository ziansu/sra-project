@java.lang.Override
protected void onPostExecute(com.google.zxing.Result result) {
    if (result == null) {
        callback.invoke((-1), "error");
    }
    if (android.text.TextUtils.isEmpty(result.getText())) {
        callback.invoke((-1), "error");
    }else {
        callback.invoke(0, result.getText());
    }
}