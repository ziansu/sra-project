@java.lang.Override
public void addBonusPoints(ee.meriloo.clients.BonusPointable customer, ee.meriloo.items.Movie movie) {
    if ((customer != null) && (movie != null)) {
        long bonusPoints = calculateBonusPoints(movie.getMovieType());
        customer.addBonusPoints(bonusPoints);
    }
}