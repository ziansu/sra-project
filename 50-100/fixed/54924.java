@org.junit.Test
public void editFilm_Fail() {
    director = new am.aca.dao.impljdbc.DirectorDaoJdbc().addDirector("", false);
    directorList = new java.util.ArrayList<>();
    directorList.add(director);
    film.setDirectors(directorList);
    filmDao.addFilm(film);
    assertFalse(filmDao.editFilm(film));
}