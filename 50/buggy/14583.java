@java.lang.Override
public void run() {
    while (!(java.lang.Thread.currentThread().isInterrupted())) {
        try {
            accept();
        } catch (java.io.IOException e) {
        }
    } 
}