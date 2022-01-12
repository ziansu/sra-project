public static void displayGameResult(java.lang.String player, boolean won) {
    javafx.application.Platform.runLater(() -> {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setContentText((((player + " ") + (won ? "won" : "lost")) + " the game!"));
        alert.showAndWait();
        java.lang.System.exit(0);
    });
}