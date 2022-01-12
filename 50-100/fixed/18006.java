private void successOnNum() {
    gameState = com.teamwan.wander.NumberGame.GameState.SUCCESS;
    ++(successCounter);
    numberDisplay.setText("");
    if (((java.lang.System.currentTimeMillis()) - (startTime)) > (gameLength)) {
        finish();
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out);
    }
}