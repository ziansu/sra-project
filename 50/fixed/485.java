@java.lang.Override
public int compare(edu.gatech.cs2340.nochill.models.MovieItem movieItem, edu.gatech.cs2340.nochill.models.MovieItem t1) {
    return (movieItem.getAverageRating()) > (t1.getAverageRating()) ? -1 : 1;
}