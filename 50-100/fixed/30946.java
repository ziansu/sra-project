public void run() {
    long startTime = java.lang.System.nanoTime();
    long currentTime;
    int i = 0;
    while (!(Client.userInput.equals("-1"))) {
        currentTime = java.lang.System.nanoTime();
        if ((startTime - currentTime) > ((i * (RUBTClient.RUBTClient.updateTracker.trackerUpdateInterval)) + 10)) {
            java.lang.System.out.println("Tracker updated!");
            RUBTClient.RUBTClient.updateTracker.tracker.sendTrackerRequest(Event.NONE);
        }
        i++;
    } 
    java.lang.System.out.println("Tracker update quit!");
}