@java.lang.Override
public void run() {
    java.lang.Object result = null;
    java.lang.Exception error = null;
    try {
        result = call.run(params.toArray());
    } catch (java.lang.Exception e) {
        error = e;
    }
    if (error != null)
        sendCallback(callbackId, error.getMessage(), null);
    else
        sendCallback(callbackId, null, result);
    
}