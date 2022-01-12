private void cardEffect(edu.chl.ChalmersRisk.model.Player targetPlayer) {
    int intTemp = (targetPlayer.getnmbrOfTerritories()) - 1;
    intTemp = ((int) ((java.lang.Math.random()) * intTemp));
    targetPlayer.removeTerritory(targetPlayer.getTerritories().get(intTemp));
}