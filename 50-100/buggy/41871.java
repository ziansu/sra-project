@java.lang.Override
public void updateState() {
    if ((z) > 0) {
        (z)--;
    }
    if ((z) == 0) {
        setVelocity(0, 0);
        for (GameObject gameObject : new java.util.ArrayList<GameObject>(this.getGameState().getGameObjectCollection())) {
            if (gameObject instanceof trashcanObject) {
                checkCollision(((trashcanObject) (gameObject)));
            }
        }
    }
}