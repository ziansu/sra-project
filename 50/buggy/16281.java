@java.lang.Override
public void run() {
    while (RUNNING) {
        try {
            tick();
            java.lang.Thread.sleep(100);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            java.lang.System.err.println("tick error");
        }
    } 
}