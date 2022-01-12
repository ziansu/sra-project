@java.lang.Override
public void run() {
    doRequest();
    while (http.Server.isOnline()) {
        try {
            java.lang.Thread.sleep(((connection.INPERequest.REQUEST_INTERVAL) * 1000));
        } catch (java.lang.InterruptedException e) {
            util.Debug.log(e);
        }
        doRequest();
    } 
}