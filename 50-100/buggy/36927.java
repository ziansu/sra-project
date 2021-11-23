@java.lang.Override
public void run() {
    if (pingGame.movePlayerUp()) {
        message = (PLAYER) + (pingGame.playerMessage());
        gameManager.write(message.getBytes(java.nio.charset.Charset.defaultCharset()));
    }
    if ((handlerUp) != null)
        handlerUp.postDelayed(this, (1000 / (FPS)));
    
}