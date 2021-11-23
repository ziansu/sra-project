@java.lang.Override
protected void onPostExecute(org.irmacard.cardemu.httpclient.HttpClientResult<T> result) {
    if ((result.getException()) == null)
        handler.onSuccess(result.getObject());
    else
        handler.onError(result.getException());
    
}