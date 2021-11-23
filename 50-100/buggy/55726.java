@java.lang.Override
public void run() {
    frame.removeCallbacks(frameUpdate);
    updateScore();
    if (scene.isCollision()) {
        jeu.getPerso().die();
    }
    if ((jeu.getPerso().getNbLife()) == 0) {
        gameover();
    }else {
        scene.invalidate();
        frame.postDelayed(frameUpdate, m2dl.com.binarydiver.MainActivity.TIME);
    }
}