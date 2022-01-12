@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.moyersoftware.contender.util.Util.Log(("data change: " + (dataSnapshot.toString())));
    if (!(dataSnapshot.exists())) {
        android.widget.Toast.makeText(this, "Game not found", Toast.LENGTH_SHORT).show();
        finish();
    }else {
        com.moyersoftware.contender.game.data.GameInvite.Game game = dataSnapshot.getValue(GameInvite.Game.class);
        if ((mGame) != game) {
            initGameDetails(game);
            mGame = game;
        }
    }
}