@org.junit.Test
public void setMovieRequestGenre() throws java.lang.Exception {
    movienight.javi.com.movienight.model.Genre expectedGenre = new movienight.javi.com.movienight.model.Genre(1235, "Lol");
    mMovieRequest.setGenre(expectedGenre);
    junit.framework.Assert.assertEquals(expectedGenre, mMovieRequest.getGenreSelected());
}