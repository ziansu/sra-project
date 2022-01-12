public static void sleep(int ms) {
    try {
        java.lang.Thread.sleep(ms);
    } catch (java.lang.InterruptedException e) {
        java.lang.Thread.currentThread().interrupt();
    }
}