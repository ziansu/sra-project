@java.lang.Override
public void setX(float x) {
    if (null != (physicsObject)) {
        physicsObject.setX((x + ((getWidth()) / 2.0F)));
    }
}