private java.lang.String getChoice(java.lang.String title, java.lang.String header, java.lang.String content, java.util.ArrayList<java.lang.String> choices) {
    javafx.scene.control.ChoiceDialog<java.lang.String> dialog = new javafx.scene.control.ChoiceDialog<>(choices.get(0), choices);
    dialog.setTitle(title);
    dialog.setHeaderText(header);
    dialog.setContentText(content);
    java.util.Optional<java.lang.String> result = dialog.showAndWait();
    if (result.isPresent())
        return result.get();
    
    return "";
}