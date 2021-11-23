@java.lang.Override
public void onException(java.lang.Exception e) {
    if ((inspector) != null)
        inspector.onConnectError(request, address, e);
    
    callback.setException(e);
}