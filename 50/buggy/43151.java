@java.lang.Override
public void onFailure(int statusCode, org.apache.http.Header[] headers, byte[] errorResponse, java.lang.Throwable e) {
    fr.s13d.photobackup.Log.e(fr.s13d.photobackup.PBMediaSender.LOG_TAG, "onFailure");
    e.printStackTrace();
}