public void stopMove(int keycode) {
    com.goblet.entities.Direction dir = com.goblet.entities.Direction.keyCodeTranslate(keycode);
    if (dir == (Direction.IDLE)) {
        return ;
    }
    if (movement.getMoveFlag(dir)) {
        movement.subMovementX(dir);
        movement.subMovementY(dir);
        movement.setMoveFlag(dir, false);
        selectAnimation();
    }
}