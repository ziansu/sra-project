@java.lang.Override
public void onResult(dji.sdk.api.DJIError result) {
    if ((result.errorCode) != (dji.sdk.api.DJIError.RESULT_OK))
        uiHandler.sendMessage(uiHandler.obtainMessage(DJIWrapper.ERROR_MESSAGE, ("Camera quality error " + (result.errorCode))));
    
}