public boolean canPlayDevCard(shared.definitions.DevCardType devCard) {
    if (((((!(isPlayerTurn())) || (hasPlayedDevCard)) || (!(getState().equals("Playing")))) || (!(game.getPlayer().getOldDevCards().hasDevCard(devCard)))) || (game.getPlayer().isPlayedDevCard()))
        return false;
    
    return true;
}