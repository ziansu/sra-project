@java.lang.Override
public boolean useBonusPoints(ee.meriloo.clients.BonusPointable customer, ee.meriloo.items.Movie movie) {
    if ((customer != null) && (isBonusPointsChargeable(customer, movie))) {
        customer.useBonusPoints(ee.meriloo.services.SimpleBonusPointsService.CHARGEABLE_BONUS_POINTS);
        return true;
    }
    return false;
}