private void miniMoveUp() {
    if (((getWCstartY()) - (wcDisplacement)) <= (building.getBuildingStartY())) {
        if ((scups.getLRscupsY()) <= (scups.getLRscupsPauseY())) {
            miniMoveUp = false;
            if (!(lastMiniMoveUp))
                miniMoveDown = true;
            
        }
    }else {
        wcMoveUp();
    }
}