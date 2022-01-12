@org.junit.Test
public void editFilm_Succeeded() {
    director = new am.aca.dao.impljdbc.DirectorDaoJdbc().addDirector("Matt Ross", false);
    directorList = new java.util.ArrayList<>();
    film.setTitle("Captain Fantastic");
    directorList.add(director);
    film.setDirectors(directorList);
    filmDao.addFilm(film);
    film.setHasOscar(true);
    assertTrue(filmDao.editFilm(film));
}