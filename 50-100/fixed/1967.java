public boolean canPlayDevCard(shared.definitions.DevCardType devCard) {
    if ((((!(isPlayerTurn())) || (hasPlayedDevCard)) || (!(getState().equals("Playing")))) || (!(game.getPlayer().getOldDevCards().hasDevCard(devCard))))
        return false;
    
    return true;
}