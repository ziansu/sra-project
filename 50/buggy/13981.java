private void ableToType(final boolean trueOrFalse) {
    javafx.application.Platform.runLater(new java.lang.Runnable() {
        public void run() {
            userText.setEditable(trueOrFalse);
        }
    });
}