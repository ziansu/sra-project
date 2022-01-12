private void startPlayActivity() {
    if ((participantNames.size()) == 0) {
        showMustAddPlayersErrorToast();
    }
    android.content.Intent intent = new android.content.Intent(this, com.fraz.dartlog.game.GameActivity.class);
    intent.putStringArrayListExtra("playerNames", participantNames);
    startActivity(intent);
}