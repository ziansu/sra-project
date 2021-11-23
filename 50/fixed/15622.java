@java.lang.Override
public void setX(float x) {
    super.setX(x);
    if (null != (physicsObject)) {
        physicsObject.setX((x + ((getWidth()) / 2.0F)));
    }
}