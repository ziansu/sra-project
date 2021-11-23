@java.lang.Override
public java.util.List<com.cinemaonline.model.client.FilmInfo> getAllUnplanedFilms() {
    return com.cinemaonline.model.client.FilmInfo.parseFI(filmDao.getAllUnplanedFilms());
}