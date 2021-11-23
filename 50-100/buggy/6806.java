public void pause() {
    br.edu.ufabc.mobile.spacecombat.game.GameView.okToRun = false;
    while (true) {
        try {
            sensorManager.unregisterListener(this);
            thread.join();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        break;
    } 
    if (br.edu.ufabc.mobile.spacecombat.game.GameView.hasSound) {
        mPlayer1.pause();
        mPlayer2.pause();
    }
    thread = null;
}