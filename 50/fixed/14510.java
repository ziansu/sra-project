@java.lang.Override
public void update() {
    uk.me.webpigeon.util.Vector2D targetForce = behavour.process();
    x += targetForce.getX();
    y += targetForce.getY();
}