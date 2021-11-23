@java.lang.Override
protected void onStop() {
    com.app.game.quizee.backend.PlayerManager.getInstance().saveCurrentPlayer();
    super.onStop();
    doBindService();
    stopService(new android.content.Intent(this, com.app.game.quizee.backend.MusicService.class));
    com.app.game.quizee.backend.PlayerManager.getInstance().onStop();
}