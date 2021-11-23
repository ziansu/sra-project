public static void safeSleep(int delay) {
    java.lang.Thread.yield();
    try {
        java.lang.Thread.sleep(delay);
        java.lang.Thread.yield();
    } catch (java.lang.Exception e) {
    }
    java.lang.Thread.yield();
}