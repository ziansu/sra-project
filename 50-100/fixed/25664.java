public void cycleMode(model.actions.ActionModifiers actionModifier) {
    model.player.ArrayAction tempArrayAction = getArrayActionUpDown(actionModifier);
    selectedEntity = complexDataStructure.circleMode(tempArrayAction);
    if (((selectedEntity) == null) && ((selectedRallyPoint) != null)) {
        selectedRallyPoint = complexDataStructure.getRallypoint();
        selectedRallyPoint.resume();
    }else {
        if ((selectedEntity) != null) {
            selectedEntity.resume();
        }
    }
}