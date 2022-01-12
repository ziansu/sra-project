@android.annotation.TargetApi(value = Build.VERSION_CODES.M)
private void onSessionMessage(final byte[] sessionId, final android.media.MediaDrm.KeyRequest request) {
    if (!(isNativeMediaDrmBridgeValid()))
        return ;
    
    int requestType = MediaDrm.KeyRequest.REQUEST_TYPE_INITIAL;
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
        requestType = request.getRequestType();
    }else {
        requestType = (request.getDefaultUrl().isEmpty()) ? MediaDrm.KeyRequest.REQUEST_TYPE_INITIAL : MediaDrm.KeyRequest.REQUEST_TYPE_RENEWAL;
    }
    nativeOnSessionMessage(mNativeMediaDrmBridge, sessionId, requestType, request.getData(), request.getDefaultUrl());
}