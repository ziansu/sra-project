public static javafx.scene.control.TextField addTextField(final javafx.scene.layout.Pane parentPane, final java.lang.String defaultText, final javafx.scene.text.Font font) {
    final javafx.scene.control.TextField txt = new javafx.scene.control.TextField(defaultText);
    if (font != null) {
        txt.setFont(font);
    }
    txt.setOnMouseEntered(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
        @java.lang.Override
        public void handle(@java.lang.SuppressWarnings(value = "unused")
        final javafx.scene.input.MouseEvent mouse) {
            txt.requestFocus();
        }
    });
    if (parentPane != null) {
        parentPane.getChildren().add(txt);
    }
    return txt;
}