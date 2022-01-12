private void playerRaise() {
    android.content.Context context = getApplicationContext();
    java.lang.CharSequence text = gameManager.getPlayerList().get(Games.Players.getCurrentPlayer(apiClient).getPlayerId());
    int duration = android.widget.Toast.LENGTH_SHORT;
    android.widget.Toast toast = android.widget.Toast.makeText(context, text, duration);
    toast.show();
}