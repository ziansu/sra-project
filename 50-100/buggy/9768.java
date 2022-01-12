private void winGame() {
    resumePauseGame();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            endGameHandler.postDelayed(new java.lang.Runnable() {
                public void run() {
                    spaceShip.win();
                }
            }, 300);
            endGame();
        }
    });
}