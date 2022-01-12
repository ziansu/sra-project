public void run() {
    try {
        runBotLoop();
    } catch (java.lang.Exception e) {
        final java.lang.String error = e.toString();
        java.lang.System.out.println(("[TELEGRAM] Error: " + error));
        if (!(lastError.equals(error))) {
            lastError = error;
            run();
        }
    }
}