@java.lang.Override
public void setPosition(float x, float y, int alignment) {
    super.setPosition(x, y, alignment);
    if ((bg) != null) {
        bg.setPosition(x, y, alignment);
    }
}