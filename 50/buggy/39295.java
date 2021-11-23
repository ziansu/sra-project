@java.lang.Override
public void run() {
    try {
        polygon.setHoles(holes);
    } catch (java.lang.Exception e) {
    }
    sendNoResult(callbackContext);
}