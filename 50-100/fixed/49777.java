@java.lang.Override
public void taskCompleted(java.util.List<ru.surf.course.movierecommendations.models.MovieInfo> result) {
    if (result != null) {
        if (((movieInfoList) != null) && (previousFilter.equalsIgnoreCase(query))) {
            movieInfoList.addAll(result);
        }else {
            movieInfoList = result;
        }
        dataLoadComplete();
    }
}