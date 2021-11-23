private slash.navigation.common.NavigationPosition findPredecessorWithTime(slash.navigation.converter.gui.models.PositionsModel positionsModel, int index) {
    while ((index--) > 0) {
        slash.navigation.common.NavigationPosition position = positionsModel.getPosition(index);
        if (position.hasTime())
            return position;
        
    } 
    return null;
}