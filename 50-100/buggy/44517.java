public void run() {
    Intermediary.LinkedEntity runner = theLevel.getHead();
    gravity(GUI.MainGame.joe);
    move(GUI.MainGame.joe);
    while ((runner.equals(null)) == false) {
        checkCollision(GUI.MainGame.joe, runner);
        manageCD(runner);
        runner = runner.next;
    } 
    repaint();
}