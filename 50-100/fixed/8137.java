private boolean isInTriggerZone(int x, int y) {
    return (((x > (main.SessionController.HITBOX_X.getFirst())) && (x < (main.SessionController.HITBOX_X.getSecond()))) && (y > (main.SessionController.HITBOX_Y.getFirst()))) && (y < (main.SessionController.HITBOX_Y.getSecond()));
}