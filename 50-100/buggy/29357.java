private void cardEffect(edu.chl.ChalmersRisk.model.Player targetPlayer) {
    int intTemp = (currentPlayer.getnmbrOfTerritories()) - 1;
    intTemp = ((int) ((java.lang.Math.random()) * intTemp));
    currentPlayer.removeTerritory(currentPlayer.getTerritories().get(intTemp));
}