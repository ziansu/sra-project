public double taiSenAugmentingBeforeThreshold(final com.kancolle.server.model.po.ship.IShip attackShip, final com.kancolle.server.model.po.battle.BattleContext context) {
    final int taisenBasicHoug = taiSenBasicHoug(attackShip);
    double augmenting = basicAugmentBeforeThreshold(attackShip, context);
    final double taisenAugmenting = taisenShellingAugmenting(attackShip);
    augmenting *= taisenAugmenting;
    if (augmenting < 0.0) {
        augmenting = 0.0;
    }
    return augmenting * taisenBasicHoug;
}