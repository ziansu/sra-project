@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody, java.lang.Throwable e) {
    com.evansappwriter.photogallery.util.Utils.printLogInfo(com.evansappwriter.photogallery.core.APIService.TAG, ("- Failed !: " + statusCode));
    processFailureRepsonse(handler, (responseBody != null ? new java.lang.String(responseBody) : null), e.toString());
}