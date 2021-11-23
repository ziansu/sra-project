@java.lang.Override
public void run() {
    if ((mp) == null) {
        callbackContext.error("Player not initialised");
    }else {
        callbackContext.success(handleVolumeResult(activity));
    }
}