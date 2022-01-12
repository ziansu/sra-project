protected void cycleTypeInstanceForward() {
    this.resetControls();
    controls.TypeController typeController = this.currentModeController.getTypeController();
    controls.typeInstance.TypeInstanceController typeInstanceController = typeController.getTypeInstanceController();
    java.lang.Enum currentType = typeController.getType();
    game.entities.ICommandable selectedEntity = typeInstanceController.cycleForward(currentType);
    if (selectedEntity != null) {
        someItemSelected = true;
        this.currentSelectedEntity = selectedEntity;
        game.gameboard.Location newLocation = selectedEntity.getLocation();
        this.changeCenterCoordinates(newLocation);
    }else {
        someItemSelected = false;
    }
}