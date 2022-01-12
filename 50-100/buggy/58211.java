@java.lang.Override
public void run() {
    this.sendHandshake();
    while (!(stop)) {
        try {
            java.lang.String message = this.v8Messages.take();
            if (message.equals(org.appcelerator.kroll.runtime.v8.JSDebugger.V8MessageHandler.STOP_MESSAGE)) {
                break;
            }
            this.sendMessageToDebugger(message);
        } catch (java.lang.Throwable t) {
            t.printStackTrace();
        }
    } 
    try {
        this.output.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}