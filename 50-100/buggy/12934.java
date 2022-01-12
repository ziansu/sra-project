@java.lang.Override
public void run() {
    while (_running) {
        try {
            scanKeyboard();
        } catch (ioio.lib.api.exception.ConnectionLostException e) {
            _running = false;
            e.printStackTrace();
        } catch (java.lang.InterruptedException e) {
            _running = false;
            e.printStackTrace();
        }
        while (!(_running));
    } 
}