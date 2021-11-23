@java.lang.Override
public void run() {
    try {
        java.lang.Object result = call.run(params.toArray());
        sendCallback(callbackId, null, result);
    } catch (java.lang.Exception e) {
        sendCallback(callbackId, e.getMessage(), null);
    }
}