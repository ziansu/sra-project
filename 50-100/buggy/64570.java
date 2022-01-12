@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.brucegiese.perfectposture.OrientationService.MSG_START_MONITORING :
            android.util.Log.d(com.brucegiese.perfectposture.OrientationService.TAG, "got message: MSG_START_MONITORING");
            com.brucegiese.perfectposture.OrientationService.sCheckingIsRunning = true;
            startChecking();
            break;
        case com.brucegiese.perfectposture.OrientationService.MSG_STOP_MONITORING :
            android.util.Log.d(com.brucegiese.perfectposture.OrientationService.TAG, "got message: MSG_STOP_MONITORING");
            stopChecking();
            com.brucegiese.perfectposture.OrientationService.sCheckingIsRunning = false;
            break;
        default :
            super.handleMessage(msg);
    }
}