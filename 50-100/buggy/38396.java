@java.lang.Override
public void run() {
    android.util.Log.i(DEBUG_TAG, "Run method");
    while (_running) {
        try {
            for (int i = 0; i < (_outPin.length); i++) {
                scanColums();
            }
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        } catch (ioio.lib.api.exception.ConnectionLostException e) {
            _running = false;
            android.util.Log.i(DEBUG_TAG, "Exited App");
        }
        if (!(_running)) {
        }
    } 
}