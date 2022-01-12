@java.lang.Override
public void setPosition(float x, float y) {
    super.setPosition(x, y);
    if ((bg) != null) {
        bg.setPosition(x, y);
    }
}