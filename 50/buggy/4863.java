private javafx.scene.control.ScrollPane createScrollPane() {
    javafx.scene.layout.VBox pdfPane = createPDFPane();
    javafx.scene.control.ScrollPane scrollPane = new javafx.scene.control.ScrollPane();
    scrollPane.setStyle("-fx-background: #CCCCCC;");
    scrollPane.setContent(pdfPane);
    return scrollPane;
}