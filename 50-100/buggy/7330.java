private void refreshLoc() {
    locations.clear();
    for (org.Point p : selectedHP.getLocations()) {
        javafx.scene.control.ChoiceBox<org.Point> cb = new javafx.scene.control.ChoiceBox<>();
        cb.setItems(javafx.collections.FXCollections.observableList(rooms));
        cb.setValue(p);
        locations.add(cb);
    }
}