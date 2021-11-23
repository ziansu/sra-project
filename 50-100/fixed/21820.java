@java.lang.Override
public void render(scibby.graphics.Screen screen) {
    screen.fillRect(getAbsolutePosition().getX(), getAbsolutePosition().getY(), width, height, bColour, true);
    screen.fillRect(getAbsolutePosition().getX(), getAbsolutePosition().getY(), ((int) (getFill())), height, fColour, true);
}