private void showDoors() {
    if ((doorsDrawService) != null) {
        int positionForShowingPins = 18;
        if ((positionZoom) >= positionForShowingPins) {
            doorsDrawService.drawDoors();
        }else {
            doorsDrawService.hideDoors();
        }
    }
}