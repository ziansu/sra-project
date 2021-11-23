@java.lang.Override
public void run() {
    while (isRunning) {
        synchronized(msgQueue) {
            while ((msgQueue.size()) == 0) {
                try {
                    msgQueue.wait();
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            } 
            while ((msgQueue.size()) != 0) {
                disposeMessage(msgQueue.remove());
            } 
        }
    } 
}