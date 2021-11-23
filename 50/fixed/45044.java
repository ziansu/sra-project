@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    if ((me.ccrama.redditslide.Authentication.httpAdapter.getNativeClient()) != null)
        me.ccrama.redditslide.Authentication.httpAdapter.getNativeClient().connectionPool().evictAll();
    
    return null;
}