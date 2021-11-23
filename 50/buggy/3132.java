private static void stopTimer() {
    i5.las2peer.webConnector.serviceManagement.ServiceRepositoryManager.timer.cancel();
    i5.las2peer.webConnector.serviceManagement.ServiceRepositoryManager.timerRunning = false;
}