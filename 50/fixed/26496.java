@java.lang.Override
public void update() {
    GameObjects.PlayerInputController.playerMover(phy);
    java.lang.System.out.println(((("X: " + (phy.getPhy_x())) + "Y: ") + (phy.getPhy_y())));
    super.update();
}