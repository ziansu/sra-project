public void mainLoop() throws java.io.IOException, java.lang.InterruptedException {
    if (componentManager.executeTests()) {
        startService(new ru.linachan.yggdrasil.YggdrasilAgentServer());
        while (runningYggdrasil) {
            java.lang.Thread.sleep(1000);
        } 
        logInfo("Yggdrasil main loop finished. Waiting another services to finish...");
        serviceRunner.shutdown();
        componentManager.shutdown();
    }else {
        shutdownYggdrasil();
    }
    logInfo("Yggdrasil is down...");
}