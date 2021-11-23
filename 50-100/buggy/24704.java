@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot DataSnapshot) {
    project.blackjack.Models.Player player = DataSnapshot.getValue(project.blackjack.Models.Player.class);
    mPlayers.add(player);
    if ((mPlayers.size()) == (playersNumber)) {
        android.widget.Toast.makeText(getApplicationContext(), "done feathcing", Toast.LENGTH_SHORT).show();
        removePlayersEventListener();
        sortPlayerListByTurn();
        setListenerForTurn();
    }
}