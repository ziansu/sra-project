@java.lang.Override
public void addBonusPoints(ee.meriloo.clients.BonusPointable customer, ee.meriloo.items.Movie movie) {
    long bonusPoints = calculateBonusPoints(movie.getMovieType());
    customer.addBonusPoints(bonusPoints);
}