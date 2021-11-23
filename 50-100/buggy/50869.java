private slash.navigation.common.NavigationPosition findSuccessorWithTime(slash.navigation.converter.gui.models.PositionsModel positionsModel, int index) {
    while ((index++) < ((positionsModel.getRowCount()) - 1)) {
        slash.navigation.common.NavigationPosition position = positionsModel.getPosition(index);
        if (position.hasTime())
            return position;
        
    } 
    return null;
}