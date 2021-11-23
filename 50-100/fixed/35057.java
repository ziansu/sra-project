public void deletePlayer(iitema.gypsypokemon.PlayerInterface dead) {
    for (int i = 0; i < 3; ++i) {
        if ((players[i]) == dead) {
            players[i] = null;
            if (((players[0]) == null) || ((players[1]) == null)) {
                endGame();
            }
            return ;
        }
    }
}