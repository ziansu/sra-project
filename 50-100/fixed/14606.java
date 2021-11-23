public void collide(Engine.ObjectTypes type, boolean x) {
    int collideForce = 3;
    if (x && (type == (ObjectTypes.STATIC))) {
        force_x = (-collideForce) * (force_x);
    }
    if ((!x) && (type == (ObjectTypes.STATIC))) {
        force_y = (-collideForce) * (force_y);
    }
    moveByForce();
}