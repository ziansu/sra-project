private void addPlayer(com.blogspot.onekeyucd.healthtracker.PlayerFragment playerToAdd) {
    try {
        mFragmentManager.beginTransaction().add(R.id.player_container, playerToAdd, playerToAdd.getName()).commit();
        (numPlayers)++;
    } catch (java.lang.Exception e) {
        android.widget.Toast.makeText(getApplicationContext(), R.string.failed_add, Toast.LENGTH_SHORT).show();
        e.printStackTrace();
    }
}