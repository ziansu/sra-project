private void showDoors() {
    int positionForShowingPins = 18;
    if ((positionZoom) >= positionForShowingPins) {
        doorsDrawService.drawDoors();
    }else {
        doorsDrawService.hideDoors();
    }
}