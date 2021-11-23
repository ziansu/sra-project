@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    android.util.Log.v(com.jimmy.hextionary.game_screen.GameView.TAG, "onNewIntent() called");
    if ((intent.getExtras()) != null) {
        if ((intent.getExtras().getInt(com.jimmy.hextionary.game_screen.INTENT_SOURCE, 0)) == (MESSAGE_SERVICE)) {
            presenter.enterFromNotification(intent.getExtras().getInt(com.jimmy.hextionary.game_screen.GAME_ID, 0));
        }
    }
}