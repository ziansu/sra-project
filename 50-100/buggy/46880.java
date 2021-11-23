@java.lang.Override
public void run() {
    javafx.application.Platform.runLater(() -> {
        try {
            lookup(".label").styleProperty().bind(new javafx.beans.property.SimpleStringProperty("-fx-text-fill: ").concat(borderStringProperty).concat(";"));
        } catch (java.lang.NullPointerException e) {
            e.printStackTrace();
        }
    });
}