@java.lang.Override
public void run() {
    while ((thread) != null) {
        synchronized(this) {
            try {
                step();
                java.lang.Thread.sleep(20);
            } catch (java.lang.InterruptedException ex) {
            }
        }
    } 
}