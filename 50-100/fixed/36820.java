@java.lang.Override
protected void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    try {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            showInternal(callback);
        }else {
            callback.onFail();
        }
    } catch (java.lang.Throwable throwable) {
        callback.onFail();
    }
}