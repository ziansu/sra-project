@java.lang.Override
protected boolean onPutStop(final android.content.Intent request, final android.content.Intent response, final java.lang.String serviceId) {
    if (serviceId == null) {
        createEmptyServiceId(response);
    }else
        if (!(checkServiceId(serviceId))) {
            createNotFoundService(response);
        }else {
            ((org.deviceconnect.android.deviceplugin.host.HostDeviceService) (getContext())).stopMedia();
            setResult(response, DConnectMessage.RESULT_OK);
        }
    
    return true;
}