@java.lang.Override
public boolean isBonusPointsChargeable(ee.meriloo.clients.BonusPointable customer, ee.meriloo.items.Movie movie) {
    if (((movie.getMovieType()) == (ee.meriloo.items.MovieType.NEW_RELEASE)) && ((customer.getBonusPoints()) >= (ee.meriloo.services.SimpleBonusPointsService.CHARGEABLE_BONUS_POINTS))) {
        return true;
    }
    return false;
}