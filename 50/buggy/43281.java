public void onClick(android.view.View v) {
    game.playTheGame(myMap.get(v));
    UpdateUIValues();
    ChangePlayer();
    CheckGameFinished();
}