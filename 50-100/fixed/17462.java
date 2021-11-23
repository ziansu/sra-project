public void run() {
    java.lang.System.out.println("");
    java.lang.System.out.println("Time's up!");
    finished = false;
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException ex) {
        java.lang.Thread.currentThread().interrupt();
    }
    java.lang.System.out.println("Type in any letter to continue...");
    timer.cancel();
}