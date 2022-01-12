public void setSelectedLocation(int id, boolean selected) {
    if (locations.setSelected(id, selected)) {
        update(UpdateType.LOCATION_SELECTION);
        reloadData();
    }
}