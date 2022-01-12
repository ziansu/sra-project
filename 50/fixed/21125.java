@java.lang.Override
public void run() {
    while (true) {
        synchronized(w) {
            try {
                w.wait();
            } catch (java.lang.InterruptedException e) {
                return ;
            }
            currentWindow.updateDisplay();
        }
    } 
}