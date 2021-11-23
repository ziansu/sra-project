private boolean isInTriggerZone(int x, int y) {
    java.lang.System.out.println("here");
    return (((x > (main.SessionController.HITBOX_X.getFirst())) && (x < (main.SessionController.HITBOX_X.getSecond()))) && (y < (main.SessionController.HITBOX_Y.getFirst()))) && (y > (main.SessionController.HITBOX_Y.getSecond()));
}