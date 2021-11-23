@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot snapshot) {
    java.lang.Boolean playerSaved = snapshot.child(authorizedPlayer.getPushId()).exists();
    if (!playerSaved) {
        firebasePlayersRef.child(authorizedPlayer.getPushId()).setValue(authorizedPlayer);
    }
    java.lang.String playerId = sharedPreferences.getString(Constants.PREFERENCES_PLAYER_KEY, null);
}