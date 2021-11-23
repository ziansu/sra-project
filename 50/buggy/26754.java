@java.lang.Override
public void update() {
    if (mouseInside()) {
        if (org.lwjgl.input.Mouse.isButtonDown(0)) {
            java.lang.System.out.println("Mouse pressed");
            ShotGunLane.current = ShotGunLane.mainmenu;
            ShotGunLane.ingame = new me.NB.SGL.GUIInGame();
            ShotGunLane.map = new me.NB.SGL.Map();
        }
    }
}