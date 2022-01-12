public void setupForNewRoom() {
    SourceryTextb1.GameObjects.Layer aimDispLayer = new SourceryTextb1.GameObjects.Layer(new java.lang.String[1][1], aimDispName);
    aimDispLayer.setOwningPlayerUsername(username);
    addHUD();
    graphicUpdate();
    orgo.addLayer(aimDispLayer);
    upPressed = false;
    downPressed = false;
    leftPressed = false;
    rightPressed = false;
}