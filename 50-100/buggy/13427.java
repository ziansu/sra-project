private model.entities.Entity changeMode(model.Mode currentMode) {
    java.lang.System.out.println(("CHANGING mode to " + currentMode));
    resetIndices();
    switch (currentMode) {
        case ARMY :
            currentModeList = null;
            selectedRallyPoint = null;
            break;
        case UNIT :
            currentModeList = unitList;
            selectedRallyPoint = null;
            break;
        case STRUCTURE :
            currentModeList = structureList;
            selectedRallyPoint = null;
            break;
        case RALLY_POINT :
            currentModeList = null;
            break;
    }
    return returnEntityOnModeChange();
}