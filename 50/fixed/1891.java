public void render() {
    if (newDataFlag) {
        checkClearCanvas();
        drawDivider();
        drawCursor();
        resetFlag();
    }else {
    }
}