public void run() {
    try {
        runBotLoop();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("[TELEGRAM] Error: " + (e.toString())));
        if (!(lastError.equals(e.toString()))) {
            run();
        }
        lastError = e.toString();
    }
}