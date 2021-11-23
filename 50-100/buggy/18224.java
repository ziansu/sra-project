public void playFarfadet(player.Ingredient card, player.Player victim) {
    int season = currentGame.getSeason();
    int[] farfadetStrength = card.getFarfadetVector();
    int rockStolen = victim.stealRocks(farfadetStrength[season], victim.getWatchDogProtection()[season]);
    this.nbRocks += rockStolen;
    this.hand.remove(card);
}