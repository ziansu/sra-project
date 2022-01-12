private static void stopTimer() {
    if ((i5.las2peer.webConnector.serviceManagement.ServiceRepositoryManager.timer) != null) {
        i5.las2peer.webConnector.serviceManagement.ServiceRepositoryManager.timer.cancel();
    }
    i5.las2peer.webConnector.serviceManagement.ServiceRepositoryManager.timer = null;
}