@java.lang.Override
public void update() {
    super.update();
    this.x = (800 / 2) + (com.p3k.magictale.game.Game.getInstance().getCameraX());
    this.y = (600 / 2) + (com.p3k.magictale.game.Game.getInstance().getCameraY());
    java.lang.System.out.print((("X: " + (getRealX())) + " "));
    java.lang.System.out.println(("Y: " + (getRealY())));
}