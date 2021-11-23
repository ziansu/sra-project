@java.lang.Override
public void setSize(float width, float height) {
    super.setSize(width, height);
    setOrigin((width / 2), (height / 2));
}