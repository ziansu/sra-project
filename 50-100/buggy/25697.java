@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    incrementGamesPlayedAchievement();
    incrementRoundsStartedEvent();
    showWaitingScreen();
    android.os.Bundle autoMatchCriteria = com.google.android.gms.games.multiplayer.realtime.RoomConfig.createAutoMatchCriteria(1, 1, 0);
    de.appphil.categories.TurnBasedGame.createMatch(getGoogleApiClient(), getApplicationContext(), de.appphil.categories.TurnBasedGame.getDefaultGameConfigForAutoMatchGames(getApplicationContext()), autoMatchCriteria);
}