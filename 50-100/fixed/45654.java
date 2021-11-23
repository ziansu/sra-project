@java.lang.Override
public void update(float delta) {
    getPosition().add(getVelocity().cpy().scl(delta));
    if (((getPosition().y) + (getSize().height)) <= 0) {
        isScrolled = true;
    }
}