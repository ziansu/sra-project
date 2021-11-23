@java.lang.Override
public univ.bigdata.course.movie.Movie movieWithHighestAverage() {
    java.util.List<univ.bigdata.course.movie.Movie> movArray = getTopKMoviesAverage(1);
    if ((movArray.size()) > 0) {
        return movArray.get(0);
    }else {
        return null;
    }
}