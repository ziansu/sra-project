@java.lang.Override
public void onPostExecute(java.lang.Void v) {
    if ((listener) == null) {
        return ;
    }
    if (isHttpStatusError) {
        listener.onHttpStatusError(httpStatusCode, httpStatusErrorMessage);
        listener.onHttpStatusError(httpStatusCode);
    }else
        if (isNetworkError) {
            listener.onNetworkError();
        }else {
            listener.onComplete();
        }
    
}