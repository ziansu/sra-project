public void keyReleased(int keycode) {
    com.goblet.entities.Direction dir = com.goblet.entities.Direction.keyCodeTranslate(keycode);
    if (dir == (Direction.IDLE)) {
        return ;
    }
    if (movement.getMoveFlag(dir)) {
        movement.setMoveFlag(dir, false);
        selectAnimation();
    }
}