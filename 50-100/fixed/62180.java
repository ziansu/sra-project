@java.lang.Override
public void completed(org.apache.http.HttpResponse result) {
    if (!(checkIfStatusIsSuccess(result)))
        return ;
    
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