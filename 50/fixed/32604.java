public void run() {
    try {
        keyThread.sleep(timeSensitiveness);
    } catch (java.lang.InterruptedException e) {
        java.lang.System.out.println(("------ Key thread interrupted -------\n" + e));
    }
}