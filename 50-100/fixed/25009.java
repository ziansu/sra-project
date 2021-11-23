public void updateFloorButtonsFAB(final int floorId) {
    if ((preSelectedFloorButton) != null) {
        preSelectedFloorButton.setEnabled(true);
    }
    preSelectedFloorButton = floorButtonsMap.get(floorId);
    if ((preSelectedFloorButton) != null) {
        preSelectedFloorButton.setEnabled(false);
    }
}