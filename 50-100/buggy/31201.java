private void removePlayer(com.blogspot.onekeyucd.healthtracker.PlayerFragment playerToRemove) {
    try {
        mFragmentManager.beginTransaction().remove(playerToRemove).commit();
        (numPlayers)--;
    } catch (java.lang.Exception e) {
        android.widget.Toast.makeText(getApplicationContext(), R.string.failed_remove, Toast.LENGTH_SHORT).show();
        e.printStackTrace();
    }
}