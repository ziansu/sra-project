protected void gameOver(meteoroids.Meteoroids.gameobjects.GameObject kill) {
    exit();
    if (kill != null) {
        objectController.killGameObject(kill);
    }
}