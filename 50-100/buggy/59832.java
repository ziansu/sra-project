public void display() {
    javafx.scene.text.Text text = new javafx.scene.text.Text();
    text.setText(question);
    text.setFont(javafx.scene.text.Font.font("Ariel", 35));
    javafx.scene.layout.HBox textAlign = new javafx.scene.layout.HBox();
    textAlign.getChildren().add(text);
    textAlign.setAlignment(javafx.geometry.Pos.CENTER);
    application.MainWindow.getBorderPane().setTop(textAlign);
}