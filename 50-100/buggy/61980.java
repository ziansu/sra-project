private void onGameFinished() {
    com.artursworld.reactiontest.controller.util.UtilsRG.info("User finished the Go-No-Go-Game successfully.");
    if ((testType) != null) {
        android.content.Intent intent;
        if (testType.equals(Type.TestTypes.InOperation.name())) {
            intent = new android.content.Intent(this, com.artursworld.reactiontest.view.games.OperationModeResultView.class);
        }else {
            intent = new android.content.Intent(this, com.artursworld.reactiontest.view.games.SingleGameResultView.class);
        }
        startActivity(intent);
        finish();
    }
}