public void playGame(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, finalproject.tap.PlayActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    PlayActivity.pausestatus = 0;
    startActivity(intent);
}