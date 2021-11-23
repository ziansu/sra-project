public void onPostExecute(java.lang.Void v) {
    if (isHttpStatusError) {
        if ((listener) != null) {
            listener.onHttpStatusError(httpStatusCode);
        }
        if ((listener) != null) {
            listener.onHttpStatusError(httpStatusCode, httpStatusErrorMessage);
        }
    }else
        if (isNetworkError) {
            if ((listener) != null) {
                listener.onNetworkError();
            }
        }else {
            if ((listener) != null) {
                listener.onComplete();
            }
        }
    
}