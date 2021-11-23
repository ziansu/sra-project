public void cstXto16() {
    if ((getUnitAtPoint(cursor.getCoord())) != null) {
        unitInspectScene.start(controlState, getUnitAtPoint(cursor.getCoord()));
        controlState = 16;
    }
}