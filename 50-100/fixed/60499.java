@java.lang.Override
public void onStartedVideoRecording(final org.deviceconnect.android.deviceplugin.theta.core.ThetaDevice.Recorder recorder, final boolean hasStarted) {
    if (hasStarted) {
        org.deviceconnect.android.message.MessageUtils.setIllegalDeviceStateError(response, "Video recording has started already.");
        sendResponse(response);
    }else {
        setResult(response, DConnectMessage.RESULT_OK);
        sendResponse(response);
        sendOnRecordingChangeEvent(serviceId, recorder, RecordingState.RECORDING);
    }
}