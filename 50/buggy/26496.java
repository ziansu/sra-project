@java.lang.Override
public void update() {
    super.update();
    GameObjects.PlayerInputController.playerMover(phy);
    java.lang.System.out.println(((("X: " + (phy.getPhy_x())) + "Y: ") + (phy.getPhy_y())));
}