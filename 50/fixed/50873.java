@java.lang.Override
public void onError(okhttp3.Call call, java.lang.Exception e) {
    dismissNormalPrograssDailogBar();
    java.lang.System.out.println(("异常" + e));
}