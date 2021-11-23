private void updateChatWindow(final java.lang.String text) {
    javafx.application.Platform.runLater(() -> {
        history.setEditable(true);
        history.appendText(text);
        history.setEditable(false);
    });
}