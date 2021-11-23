public void tryStartGame() throws me.stuntguy3000.java.telegames.object.exception.GameStartException {
    if ((activePlayers.size()) >= (getMinPlayers())) {
        if ((activePlayers.size()) > (getMaxPlayers())) {
            throw new me.stuntguy3000.java.telegames.object.exception.GameStartException(("Too many players! Maximum: " + (getMaxPlayers())));
        }else {
            startGame();
        }
    }else {
        throw new me.stuntguy3000.java.telegames.object.exception.GameStartException(("Not enough players! Required: " + (getMinPlayers())));
    }
}