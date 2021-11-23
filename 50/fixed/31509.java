@Test
public void save_savesIntoDatabase_true() {
    mMovie.save();
    assertTrue(Movie.all().get(0).equals(mMovie));
}