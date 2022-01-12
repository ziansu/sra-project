@java.lang.Override
public java.lang.Boolean call(com.etiennelawlor.moviehub.data.model.MoviesPage moviesPage) {
    return !(moviesPage.isExpired());
}