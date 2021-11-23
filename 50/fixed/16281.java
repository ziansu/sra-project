@java.lang.Override
public void run() {
    while (RUNNING) {
        try {
            tick();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            java.lang.System.err.println("tick error");
        }
    } 
}