public static info.movito.themoviedbapi.model.Credits getSeriesCredits(int id) throws java.lang.Throwable {
    info.movito.themoviedbapi.TmdbTV series = com.keeptv.keeptv.utils.MovieDataProvider.TMDB_API.getTvSeries();
    return series.getCredits(id, "en");
}