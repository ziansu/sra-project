public final javafx.scene.image.Image getImage(final info.movito.themoviedbapi.model.Multi query) {
    switch (query.getMediaType()) {
        case MOVIE :
            return getMovieImage(((info.movito.themoviedbapi.model.MovieDb) (query)));
        case TV_SERIES :
            return getSeriesImage(((info.movito.themoviedbapi.model.tv.TvSeries) (query)));
        case PERSON :
            return getPersonImage(((info.movito.themoviedbapi.model.people.Person) (query)));
        default :
            return null;
    }
}