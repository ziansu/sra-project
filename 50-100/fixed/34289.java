public void setCardsDestinationForChoice(metier.Destination destination) {
    paneDestination.toFront();
    javafx.scene.control.Label lbl = new javafx.scene.control.Label();
    lbl.getStylesheets().add(themeUrl);
    javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResourceAsStream(destination.getLienImage()));
    lbl.setGraphic(new javafx.scene.image.ImageView(image));
    lbl.setOnMouseClicked(this::selectionCardDestination);
    carteD.put(lbl, destination);
    hboxDestinationSelect.getChildren().add(lbl);
}