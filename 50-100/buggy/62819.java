private void startGame(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.boardgame.friday.GameActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putSerializable(GameActivity.GAME_LEVEL, currentLevel);
    intent.putExtras(bundle);
    startActivityForResult(intent, com.boardgame.friday.TitleActivity.START_GAME_REQUEST);
}