public void endGame() {
    gameThread.setRunning(false);
    while (true) {
        try {
            gameThread.join();
            break;
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
    android.content.Intent intent = new android.content.Intent(getContext(), zacke.ghostbound.GameOverActivity.class);
    intent.putExtra("score", java.lang.String.valueOf(player.getScore()));
    getContext().startActivity(intent);
}