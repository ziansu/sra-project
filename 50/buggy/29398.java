private void startNewGame() {
    android.content.Intent intent = new android.content.Intent(this.getApplicationContext(), com.tomade.saufomat.activity.CreatePlayerActivity.class);
    intent.putExtra(IntentParameter.MainGame.NEW_GAME, true);
    this.startActivity(intent);
}