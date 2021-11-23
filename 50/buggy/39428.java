public static void sleep(int ms) {
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        java.lang.Thread.currentThread().interrupt();
    }
}