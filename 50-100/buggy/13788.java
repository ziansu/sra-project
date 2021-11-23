@java.lang.Override
public final void onFailure(int statesCode, org.apache.http.Header[] paramArrayOfHeader, java.lang.Throwable throwable, byte[] response, java.io.File paramFile) {
    com.ksyun.ks3.exception.Ks3Error error = new com.ksyun.ks3.exception.Ks3Error(statesCode, response, throwable);
    this.onTaskFailure(statesCode, error, paramArrayOfHeader, throwable, paramFile);
}