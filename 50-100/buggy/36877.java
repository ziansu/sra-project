@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    if (!(game.isPossFlag()));
    changePossession();
    android.widget.Toast t = android.widget.Toast.makeText(getApplicationContext(), ((((game.getHomeTeam().getTeamName()) + " will kick to ") + (game.getAwayTeam().getTeamName())) + " to begin the game"), Toast.LENGTH_SHORT);
    t.show();
}