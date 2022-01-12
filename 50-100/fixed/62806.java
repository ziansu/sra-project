private void miniMoveDown() {
    if (((getWCstartY()) + (wcDisplacement)) >= ((building.getBuildingStartY()) + (getWCheight()))) {
        miniMoveDown = false;
        if (!(cleanWindow)) {
            moveDown = true;
        }else {
            moveRight = true;
            firstMoveRight = true;
        }
    }else {
        wcMoveDown();
    }
}