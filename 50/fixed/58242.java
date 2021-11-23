@java.lang.Override
public void run() {
    if (!(gameover)) {
        if (running) {
            gameLoop();
        }else {
            pause();
        }
    }else {
        gameOver();
    }
}