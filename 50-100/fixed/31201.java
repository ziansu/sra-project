private void removePlayer(com.blogspot.onekeyucd.healthtracker.PlayerFragment playerToRemove) {
    if (playerToRemove != null) {
        mFragmentManager.beginTransaction().remove(playerToRemove).commit();
        (numPlayers)--;
    }else {
        android.widget.Toast.makeText(getApplicationContext(), R.string.failed_remove, Toast.LENGTH_SHORT).show();
    }
}