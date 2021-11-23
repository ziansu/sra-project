private void addPlayer(com.blogspot.onekeyucd.healthtracker.PlayerFragment playerToAdd) {
    if (playerToAdd != null) {
        mFragmentManager.beginTransaction().add(R.id.player_container, playerToAdd, playerToAdd.getName()).commit();
        (numPlayers)++;
    }else {
        android.widget.Toast.makeText(getApplicationContext(), R.string.failed_add, Toast.LENGTH_SHORT).show();
    }
}