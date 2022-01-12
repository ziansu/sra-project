@java.lang.Override
public void onResume() {
    super.onResume();
    android.content.SharedPreferences savedState = getSharedPreferences(com.example.android.magicgamecounter.MainActivity.STATE_NAME, com.example.android.magicgamecounter.MODE_PRIVATE);
    player_1_total = savedState.getInt(com.example.android.magicgamecounter.MainActivity.PLAYER1, (-1));
    player_2_total = savedState.getInt(com.example.android.magicgamecounter.MainActivity.PLAYER2, (-1));
    displayForPlayer(com.example.android.magicgamecounter.MainActivity.PLAYER1, player_1_total, false);
    displayForPlayer(com.example.android.magicgamecounter.MainActivity.PLAYER2, player_2_total, false);
}