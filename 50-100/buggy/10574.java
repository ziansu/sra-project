private void setSPenToolActionWithAllCanvases(int toolAction) {
    for (int i = 0; i < (numWritableCharBoxCols); i++) {
        for (int j = 0; j < (numCharBoxesInCol); j++) {
            if (mCharBoxes[i][j].isActivated()) {
                mCharBoxes[i][j].setToolTypeAction(SpenSurfaceView.TOOL_SPEN, toolAction);
            }
        }
    }
    return ;
}