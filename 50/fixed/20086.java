@java.lang.Override
public void afterInit(com.wealoha.libcurldroid.CurlHttp curlHttp, java.lang.String url) {
    curlHttp.setTimeoutMillis((1000 * 20));
    curlHttp.setConnectionTimeoutMillis((1000 * 10));
}