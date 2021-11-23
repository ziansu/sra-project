@java.lang.Override
protected void onStop() {
    com.app.game.quizee.backend.PlayerManager.getInstance().saveCurrentPlayer();
    super.onStop();
    com.app.game.quizee.backend.PlayerManager.getInstance().onStop();
}