public void update(long delta) {
    hub.update(mouseInput);
    myArcBallCamera.update(delta, mouseInput, keyboardInput.getCameraMove());
    selectionObject.updateObjectSelection();
    selectionObject.moveMarker();
    selectionObject.select();
}