private int findPredecessorWithTime(slash.navigation.converter.gui.models.PositionsModel positionsModel, int index) {
    do {
        slash.navigation.common.NavigationPosition position = positionsModel.getPosition(index);
        if (position.hasTime())
            return index;
        
    } while ((index--) > 0 );
    return -1;
}