@org.junit.Test
public void getFilmById_Succeeded() {
    director = new am.aca.dao.impljdbc.DirectorDaoJdbc().addDirector("Matt Ross", false);
    directorList = new java.util.ArrayList<>();
    film.setTitle("Captain Fantastic");
    directorList.add(director);
    film.setDirectors(directorList);
    filmDao.addFilm(film);
    int id = film.getId();
    assertTrue(filmDao.getFilmById(id).equals(film));
}