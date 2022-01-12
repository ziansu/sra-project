@java.lang.Override
public void run() {
    do {
        doRequest();
        try {
            java.lang.Thread.sleep(((connection.INPERequest.REQUEST_INTERVAL) * 1000));
        } catch (java.lang.InterruptedException e) {
            util.Debug.log(e);
        }
    } while (http.Server.isOnline() );
}