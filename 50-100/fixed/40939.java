private void miniMoveUp() {
    if (((getWCstartY()) - (wcDisplacement)) <= (building.getBuildingStartY())) {
        miniMoveUp = false;
        if (!(lastMiniMoveUp))
            miniMoveDown = true;
        
    }else {
        wcMoveUp();
    }
}