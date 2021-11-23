@org.junit.Test
public void rateFilm() {
    director = new am.aca.dao.impljdbc.DirectorDaoJdbc().addDirector("Matt Ross", false);
    directorList = new java.util.ArrayList<>();
    film.setTitle("Captain Fantastic");
    directorList.add(director);
    film.setDirectors(directorList);
    filmDao.addFilm(film);
    org.junit.Assert.Assert.assertTrue(filmDao.rateFilm(film.getId(), 5));
}