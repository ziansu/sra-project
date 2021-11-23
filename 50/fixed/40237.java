public void setPlacesIds(java.util.ArrayList<java.lang.String> placesIds) {
    placesIds.add("0");
    PLACES = placesIds;
    initializeDataset();
    loadData();
    doTraining();
}