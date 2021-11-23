@java.lang.Override
public void setY(float y) {
    super.setY(y);
    if (null != (physicsObject)) {
        physicsObject.setY((y + ((getHeight()) / 2.0F)));
    }
}