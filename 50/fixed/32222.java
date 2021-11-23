@java.lang.Override
protected void onException(java.lang.Exception e) {
    if ((inspector) != null)
        inspector.onResolveError(request, e);
    
    callback.setException(e);
}