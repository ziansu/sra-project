@java.lang.Override
public void run() {
    if (pingGame.movePlayerUp()) {
        message = (PLAYER) + (pingGame.playerMessage());
        gameManager.write(message);
    }
    if ((handlerUp) != null)
        handlerUp.postDelayed(this, (1000 / (FPS)));
    
}