@org.junit.Test
public void testReplaceExistingMovie() {
    com.example.user.movierankings.Ranking rankings = new com.example.user.movierankings.Ranking(movies);
    int rank = 10;
    com.example.user.movierankings.Movie newMovie = new com.example.user.movierankings.Movie("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", rank);
    rankings.setMovie(newMovie);
    junit.framework.Assert.assertEquals(newMovie.toString(), rankings.getMovieByRank(rank).toString());
}