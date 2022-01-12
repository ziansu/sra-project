private void updateLocation(java.util.List<mysql.result.Location> list) {
    javafx.scene.control.TreeItem<mysql.result.Location> rootItem = new javafx.scene.control.TreeItem<mysql.result.Location>(new mysql.result.Location(0, "Welt", "0000", null));
    rootItem.setExpanded(true);
    for (mysql.result.Location location : list) {
        rootItem.getChildren().add(new javafx.scene.control.TreeItem<mysql.result.Location>(location));
    }
    trvLocation.setRoot(rootItem);
    tipLocation.setDisable(false);
}