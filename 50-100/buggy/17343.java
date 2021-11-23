@java.lang.Override
public void run() {
    while ((java.lang.Thread.currentThread()) == (thread)) {
        if (initialized) {
            updateVars();
            repaint();
            if ((pauseTime) > 0) {
                try {
                    java.lang.Thread.sleep(pauseTime);
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    } 
}