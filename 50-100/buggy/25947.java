@java.lang.Override
public void run() {
    while (run) {
        if ((ticks) == 0) {
            board.createObstacle();
            ticks = 400;
        }
        player.calculatePosition();
        for (hs.ss16.asp.Sprite sprite : sprites) {
            sprite.calculatePosition();
        }
        board.repaint();
        (ticks)--;
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}