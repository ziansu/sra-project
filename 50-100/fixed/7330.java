private void refreshLoc() {
    locations.clear();
    if ((selectedHP) != null) {
        for (org.Point p : selectedHP.getLocations()) {
            javafx.scene.control.ChoiceBox<org.Point> cb = new javafx.scene.control.ChoiceBox<>();
            cb.setItems(javafx.collections.FXCollections.observableList(rooms));
            cb.setValue(p);
            locations.add(cb);
        }
    }
}