void showRunningMessage(boolean running) {
    if (running)
        testsHeaderRunningMessage.setHTML("Running...");
    else
        testsHeaderRunningMessage.setHTML("");
    
}