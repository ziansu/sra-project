public void disconnect() {
    worker.sendQuit();
    javafx.application.Platform.runLater(() -> theClient.quit());
    returnToLogin();
}