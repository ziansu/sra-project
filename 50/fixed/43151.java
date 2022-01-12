@java.lang.Override
public void onFailure(int statusCode, org.apache.http.Header[] headers, byte[] errorResponse, java.lang.Throwable e) {
    fr.s13d.photobackup.Log.i(fr.s13d.photobackup.PBMediaSender.LOG_TAG, "onFailure");
    e.printStackTrace();
}