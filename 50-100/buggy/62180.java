@java.lang.Override
public void completed(org.apache.http.HttpResponse result) {
    checkIfStatusIsSuccess(result);
    org.apache.http.HttpEntity entity = null;
    try {
        entity = result.getEntity();
        callback.onComplete(readValueAndCreateObject(entity));
        close(httpAsyncClient, callback);
    } catch (java.io.IOException e) {
        failed(e);
    } finally {
        finallyClose(entity);
    }
}