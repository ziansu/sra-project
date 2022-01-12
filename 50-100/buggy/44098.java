@java.lang.Override
public void run() {
    java.lang.System.out.println("Running cycling thread");
    while (!(isInterrupted())) {
        try {
            java.lang.System.out.println("Cycling hands");
            cycleHands();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            interrupt();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
            interrupt();
        }
    } 
    cyclingThread = null;
}