public void removeLocation() {
    if ((selectedHP) != null) {
        locations.remove(selectedCB);
        Locations.setItems(javafx.collections.FXCollections.observableList(locations));
    }
}