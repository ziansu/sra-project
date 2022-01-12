@org.junit.Test
public void testAllMoviesInArray() {
    com.example.user.movierankings.Ranking rankings = new com.example.user.movierankings.Ranking(movies);
    for (int i = 0; i < 10; i++) {
        junit.framework.Assert.assertEquals(movies[i].toString(), rankings.getMovieByRank(i).toString());
    }
}