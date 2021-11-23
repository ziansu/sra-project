@java.lang.Override
public void addPlayer(java.lang.String name, long cash) {
    if ((getPlayerIndex(name)) >= 0)
        throw new de.hsaugsburg.ShareGame.AccountManagement.Exceptions.PlayerAlreadyExistsException();
    
    players[playerCount] = new de.hsaugsburg.ShareGame.AccountManagement.Player(name, cash);
    (playerCount)++;
}