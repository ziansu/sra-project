@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        (value)++;
        if ((value) > (framwork.ProgressBar.goal)) {
            value = 0;
            done = true;
        }
    } 
}